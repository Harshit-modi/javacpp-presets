// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



/*-------------------------------------------------------------------------*
 *                              Pix tiling                                 *
 *-------------------------------------------------------------------------*/

/** Pix tiling */
@Name("PixTiling") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXTILING extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXTILING() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXTILING(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXTILING(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXTILING position(long position) {
        return (PIXTILING)super.position(position);
    }

    /** input pix (a clone)               */
    public native PIX pix(); public native PIXTILING pix(PIX pix);
    /** number of tiles horizontally      */
    public native @Cast("l_int32") int nx(); public native PIXTILING nx(int nx);
    /** number of tiles vertically        */
    public native @Cast("l_int32") int ny(); public native PIXTILING ny(int ny);
    /** tile width                        */
    public native @Cast("l_int32") int w(); public native PIXTILING w(int w);
    /** tile height                       */
    public native @Cast("l_int32") int h(); public native PIXTILING h(int h);
    /** overlap on left and right         */
    public native @Cast("l_int32") int xoverlap(); public native PIXTILING xoverlap(int xoverlap);
    /** overlap on top and bottom         */
    public native @Cast("l_int32") int yoverlap(); public native PIXTILING yoverlap(int yoverlap);
    /** strip for paint; default is TRUE  */
    public native @Cast("l_int32") int strip(); public native PIXTILING strip(int strip);
}
