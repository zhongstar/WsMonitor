/*
 * Copyright 2015 Michael Quigley
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

package com.ws.quigley.zabbixj.core.metrics;

import com.quigley.zabbixj.metrics.*;

/**
 * The MetricsProvider interface must be implemented by any classes wishing to
 * expose metrics via ZABBIX/J.
 * 
 * @author Michael Quigley
 */
public interface MetricsProvider {
	/**
	 * @param mKey a MetricsKey instance describing the metric to retrieve.
	 * @return the value of the key.
	 * @throws MetricsException when a problem is encountered retrieving a value
	 *         for the specified key; typically when a key is not found.
	 */
	public Object getValue(com.quigley.zabbixj.metrics.MetricsKey mKey) throws MetricsException;
}