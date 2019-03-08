// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Split a {@code SparseTensor} into {@code num_split} tensors along one dimension.
 * 
 *  If the {@code shape[split_dim]} is not an integer multiple of {@code num_split}. Slices
 *  {@code [0 : shape[split_dim] % num_split]} gets one extra dimension.
 *  For example, if {@code split_dim = 1} and {@code num_split = 2} and the input is
 * 
 *      input_tensor = shape = [2, 7]
 *      [    a   d e  ]
 *      [b c          ]
 * 
 *  Graphically the output tensors are:
 * 
 *      output_tensor[0] = shape = [2, 4]
 *      [    a  ]
 *      [b c    ]
 * 
 *      output_tensor[1] = shape = [2, 3]
 *      [ d e  ]
 *      [      ]
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * split_dim: 0-D.  The dimension along which to split.  Must be in the range
 *  {@code [0, rank(shape))}.
 *  * indices: 2-D tensor represents the indices of the sparse tensor.
 *  * values: 1-D tensor represents the values of the sparse tensor.
 *  * shape: 1-D. tensor represents the shape of the sparse tensor.
 *  output indices: A list of 1-D tensors represents the indices of the output
 *  sparse tensors.
 *  * num_split: The number of ways to split.
 * 
 *  Returns:
 *  * {@code OutputList} output_indices
 *  * {@code OutputList} output_values: A list of 1-D tensors represents the values of the output sparse
 *  tensors.
 *  * {@code OutputList} output_shape: A list of 1-D tensors represents the shape of the output sparse
 *  tensors. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSplit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSplit(Pointer p) { super(p); }

  public SparseSplit(@Const @ByRef Scope scope, @ByVal Input split_dim,
              @ByVal Input indices, @ByVal Input values,
              @ByVal Input shape, @Cast("tensorflow::int64") long num_split) { super((Pointer)null); allocate(scope, split_dim, indices, values, shape, num_split); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input split_dim,
              @ByVal Input indices, @ByVal Input values,
              @ByVal Input shape, @Cast("tensorflow::int64") long num_split);

  public native @ByRef Operation operation(); public native SparseSplit operation(Operation operation);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output_indices(); public native SparseSplit output_indices(OutputVector output_indices);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output_values(); public native SparseSplit output_values(OutputVector output_values);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output_shape(); public native SparseSplit output_shape(OutputVector output_shape);
}