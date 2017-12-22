/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.metron.dataloads.nonbulk.flatfile.writer;

import org.apache.hadoop.conf.Configuration;
import org.apache.metron.common.utils.SerDeUtils;

import java.io.IOException;

public class ToStringWriter implements Writer{
  @Override
  public void validate(String output, Configuration hadoopConfig) {

  }

  @Override
  public void write(Object obj, String output, Configuration hadoopConfig) throws IOException {
    System.out.println(obj);
  }

  @Override
  public void write(byte[] obj, String output, Configuration hadoopConfig) throws IOException {
    System.out.println(SerDeUtils.fromBytes(obj, Object.class));
  }
}
