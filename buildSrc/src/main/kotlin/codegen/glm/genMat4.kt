package codegen.glm

import codegen.*
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.FLOAT_ARRAY
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier

fun genMat4(): FileSpec =
        buildFile("glm", "Mat4") {
            indent("\t")

            buildClass("Mat4") {

                property {
                    name = "storage"
                    type = FLOAT_ARRAY
                    initializer = "FloatArray(16)"
                }
//                property("storage", FLOAT_ARRAY, KModifier.PRIVATE)
//
//
//
//                mutableProperty("x", FLOAT) {
//                    getter {
//                        statement("return storage[0]")
//                    }
//                    setter {
//                        parameter("value", FLOAT)
//                        statement("storage[0] = value")
//                    }
//                }
//                mutableProperty("y", FLOAT) {
//                    getter {
//                        statement("return storage[1]")
//                    }
//                    setter {
//                        parameter("value", FLOAT)
//                        statement("storage[1] = value")
//                    }
//                }
//
//                secondaryConstructor {
//                    parameter("x", FLOAT)
//                    parameter("y", FLOAT)
//                    statement("storage = floatArrayOf(x, y)")
//                }
            }
        }