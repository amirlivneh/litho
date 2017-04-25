/**
 * Copyright (c) 2017-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.litho.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A prop passed silently down from a Spec's parents.
 * The parent should set the prop in a {@link OnCreateTreeProp} method.
 * Both the name and type of a child's TreeProp should match exactly to what is set in the parent.
 */
@Retention(RetentionPolicy.CLASS)
public @interface TreeProp {
}