package org.frice.obj

import org.frice.anim.move.DoublePair
import org.frice.resource.image.ImageResource
import org.frice.utils.graphics.shape.FRectangle

class ObjectGroup
@JvmOverloads
constructor(val objs: MutableList<org.frice.obj.FObject> = emptyList<org.frice.obj.FObject>().toMutableList()) : org.frice.obj.FObject() {
	override var x = Double.MAX_VALUE
	override var y = Double.MAX_VALUE
	override var width = 0.0
	override var height = 0.0
	override val collideBox: FRectangle

	init {
		var r = 0.0
		var d = 0.0
		objs.forEach { o ->
			x = Math.min(x, o.x)
			y = Math.min(y, o.y)
			r = Math.max(r, o.x + o.width)
			d = Math.max(d, o.y + o.height)
		}
		width = r - x
		height = d - y
		collideBox = FRectangle(width, height)
	}

	override fun isCollide(other: org.frice.obj.CollideBox) = objs.any { it.isCollide(other) }
	override fun getResource() = org.frice.resource.image.ImageResource.empty()
	override fun scale(x: Double, y: Double) = objs.forEach { it.scale(x, y) }
	override fun move(p: org.frice.anim.move.DoublePair) = objs.forEach { it.move(p) }
	override fun rotate(angle: Double) = objs.forEach { it.rotate(angle) }

	fun addObject(vararg objects: org.frice.obj.FObject) = objects.forEach { objs.remove(it) }
	fun removeObject(vararg objects: org.frice.obj.FObject) = objects.forEach { objs.remove(it) }
}