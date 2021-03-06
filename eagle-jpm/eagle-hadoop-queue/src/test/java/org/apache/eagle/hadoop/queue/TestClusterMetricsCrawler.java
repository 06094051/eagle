/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.eagle.hadoop.queue;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.eagle.hadoop.queue.common.HadoopYarnResourceUtils;
import org.apache.eagle.hadoop.queue.crawler.ClusterMetricsCrawler;
import org.junit.Ignore;
import org.junit.Test;

public class TestClusterMetricsCrawler {

    @Test @Ignore
    public void test() {
        String site = "sandbox";
        Config config = ConfigFactory.load();

        String baseUrl = HadoopYarnResourceUtils.getConfigValue(config, "dataSourceConfig.RMEndPoints", "");
        ClusterMetricsCrawler crawler = new ClusterMetricsCrawler(site, baseUrl, null);
        crawler.run();
    }
}
