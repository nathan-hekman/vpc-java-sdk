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
 * OperatingSystem.
 */
public class OperatingSystem extends GenericModel {

  protected String architecture;
  @SerializedName("display_name")
  protected String displayName;
  protected String family;
  protected String href;
  protected String name;
  protected String vendor;
  protected String version;

  /**
   * Gets the architecture.
   *
   * The operating system architecture.
   *
   * @return the architecture
   */
  public String getArchitecture() {
    return architecture;
  }

  /**
   * Gets the displayName.
   *
   * A unique, display-friendly name for the operating system.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the family.
   *
   * The name of the software family this operating system belongs to.
   *
   * @return the family
   */
  public String getFamily() {
    return family;
  }

  /**
   * Gets the href.
   *
   * The URL for this operating system.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The globally unique name for this operating system.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the vendor.
   *
   * The vendor of the operating system.
   *
   * @return the vendor
   */
  public String getVendor() {
    return vendor;
  }

  /**
   * Gets the version.
   *
   * The major release version of this operating system.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }
}

