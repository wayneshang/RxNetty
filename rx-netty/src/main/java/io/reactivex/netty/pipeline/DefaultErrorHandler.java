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
package io.reactivex.netty.pipeline;

import io.reactivex.netty.server.ErrorHandler;
import rx.Observable;

/**
* @author Nitesh Kant
*/
class DefaultErrorHandler implements ErrorHandler {

    @Override
    public Observable<Void> handleError(Throwable throwable) {
        System.err.println("Unexpected error in RxNetty. Error: " + throwable.getMessage());
        throwable.printStackTrace(System.err);
        return Observable.empty();
    }
}