//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/dependent/dependencies.txt`
//

actual fun ac_platformDependentAc(): String = "aJvm"
fun aJvm_platformOnly() = "aJvm"

fun TestAJvm() {
  aJvm_platformOnly()
  AJvmJavaClass().doStuff()
  ac_platformIndependentAc()
  ac_platformDependentAc()
}
