package  glm.mat4x4

import  glm.vec4.Vec4t

abstract interface Mat4x4t<T : Vec4t<*>> {

    var value: MutableList<T>

    fun length() = 4
}