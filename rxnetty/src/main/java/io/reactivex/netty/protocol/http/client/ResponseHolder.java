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

package io.reactivex.netty.protocol.http.client;

/**
 * @author Nitesh Kant
 */
public class ResponseHolder<T> {

    private final HttpClientResponse<T> response;
    private final T content;

    public ResponseHolder(HttpClientResponse<T> response, T content) {
        this.response = response;
        this.content = content;
    }

    public ResponseHolder(HttpClientResponse<T> response) {
        this.response = response;
        content = null;
    }

    public HttpClientResponse<T> getResponse() {
        return response;
    }

    /**
     * Returns the content, if any. Use {@link #hasContent()} to check if there is a content in this holder.
     *
     * @return The content, if any, {@code null} otherwise.
     * Use {@link #hasContent()} to check if there is a content in this holder.
     */
    public T getContent() {
        return content;
    }

    public boolean hasContent() {
        return null != content;
    }
}
