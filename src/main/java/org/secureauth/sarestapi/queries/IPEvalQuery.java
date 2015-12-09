package org.secureauth.sarestapi.queries;

import org.secureauth.sarestapi.resources.s;

/**
 * @author rrowcliffe@secureauth.com
 *
 * <p>
 * Copyright 2015 SecureAuth Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */
public class IPEvalQuery {


    public static String queryIPEval(String realm){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(realm).append(s.APPLIANCE_IPEVAL);
        return stringBuilder.toString();
    }
}
