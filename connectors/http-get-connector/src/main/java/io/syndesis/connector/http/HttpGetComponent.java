/**
 * Copyright (C) 2017 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.connector.http;

import org.apache.camel.component.connector.DefaultConnectorComponent;

/**
 * Camel HTTP GET connector
 */
public class HttpGetComponent extends DefaultConnectorComponent {
    
    public HttpGetComponent() {
        super("http-get", HttpGetComponent.class.getName());
    }

}
