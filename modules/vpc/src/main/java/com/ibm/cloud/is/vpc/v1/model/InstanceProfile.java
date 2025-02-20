/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.is.vpc.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceProfile.
 */
public class InstanceProfile extends GenericModel {

  protected InstanceProfileBandwidth bandwidth;
  protected String family;
  protected String href;
  protected InstanceProfileMemory memory;
  protected String name;
  @SerializedName("os_architecture")
  protected InstanceProfileOSArchitecture osArchitecture;
  @SerializedName("port_speed")
  protected InstanceProfilePortSpeed portSpeed;
  @SerializedName("vcpu_architecture")
  protected InstanceProfileVCPUArchitecture vcpuArchitecture;
  @SerializedName("vcpu_count")
  protected InstanceProfileVCPU vcpuCount;

  /**
   * Gets the bandwidth.
   *
   * @return the bandwidth
   */
  public InstanceProfileBandwidth getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the family.
   *
   * The product family this virtual server instance profile belongs to.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this virtual server instance profile.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the memory.
   *
   * @return the memory
   */
  public InstanceProfileMemory getMemory() {
    return memory;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this virtual server instance profile.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the osArchitecture.
   *
   * @return the osArchitecture
   */
  public InstanceProfileOSArchitecture getOsArchitecture() {
    return osArchitecture;
  }

  /**
   * Gets the portSpeed.
   *
   * @return the portSpeed
   */
  public InstanceProfilePortSpeed getPortSpeed() {
    return portSpeed;
  }

  /**
   * Gets the vcpuArchitecture.
   *
   * @return the vcpuArchitecture
   */
  public InstanceProfileVCPUArchitecture getVcpuArchitecture() {
    return vcpuArchitecture;
  }

  /**
   * Gets the vcpuCount.
   *
   * @return the vcpuCount
   */
  public InstanceProfileVCPU getVcpuCount() {
    return vcpuCount;
  }
}

