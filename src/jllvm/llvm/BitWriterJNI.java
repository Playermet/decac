/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jllvm.llvm;

class BitWriterJNI {
  public final static native int LLVMWriteBitcodeToFile(long jarg1, String jarg2);
  public final static native int LLVMWriteBitcodeToFD(long jarg1, int jarg2, int jarg3, int jarg4);
  public final static native int LLVMWriteBitcodeToFileHandle(long jarg1, int jarg2);
}
