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
 * VolumePrototype.
 *
 * Classes which extend this class:
 * - VolumePrototypeVolumeByCapacity
 */
public class VolumePrototype extends GenericModel {

  @SerializedName("encryption_key")
  protected EncryptionKeyIdentity encryptionKey;
  protected Long iops;
  protected String name;
  protected VolumeProfileIdentity profile;
  @SerializedName("resource_group")
  protected ResourceGroupIdentity resourceGroup;
  protected ZoneIdentity zone;
  protected Long capacity;

  protected VolumePrototype() {
  }

  /**
   * Gets the encryptionKey.
   *
   * The identity of the root key to use to wrap the data encryption key for the volume.
   *
   * If this property is not provided, the `encryption` type for the volume will be
   * `provider_managed`.
   *
   * @return the encryptionKey
   */
  public EncryptionKeyIdentity encryptionKey() {
    return encryptionKey;
  }

  /**
   * Gets the iops.
   *
   * The bandwidth for the volume.
   *
   * @return the iops
   */
  public Long iops() {
    return iops;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this volume.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile to use for this volume.
   *
   * @return the profile
   */
  public VolumeProfileIdentity profile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) is used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the zone.
   *
   * The zone this volume will reside in.
   *
   * @return the zone
   */
  public ZoneIdentity zone() {
    return zone;
  }

  /**
   * Gets the capacity.
   *
   * The capacity of the volume in gigabytes. The specified minimum and maximum capacity values for creating or updating
   * volumes may expand in the future.
   *
   * @return the capacity
   */
  public Long capacity() {
    return capacity;
  }
}

