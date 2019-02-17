/*
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.reactivex.netty.channel;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

/**
 * A simple implementation of {@link ContentTransformer} to convert a byte array to {@link ByteBuf}
 *
 * @author Nitesh Kant
 */
public class ByteTransformer implements ContentTransformer<byte[]> {

    public static final ByteTransformer DEFAULT_INSTANCE = new ByteTransformer();

    @Override
    public ByteBuf call(byte[] toTransform, ByteBufAllocator allocator) {
        return allocator.buffer(toTransform.length).writeBytes(toTransform);
    }
}
