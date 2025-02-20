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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DedicatedHost.
 */
public class DedicatedHost extends GenericModel {

  /**
   * The lifecycle state of the dedicated host resource.
   */
  public interface LifecycleState {
    /** deleted. */
    String DELETED = "deleted";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
    /** suspended. */
    String SUSPENDED = "suspended";
  }

  /**
   * The type of resource referenced.
   */
  public interface ResourceType {
    /** dedicated_host. */
    String DEDICATED_HOST = "dedicated_host";
  }

  /**
   * The administrative state of the dedicated host.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the dedicated host on which
   * the unexpected property value was encountered.
   */
  public interface State {
    /** available. */
    String AVAILABLE = "available";
    /** degraded. */
    String DEGRADED = "degraded";
    /** migrating. */
    String MIGRATING = "migrating";
    /** unavailable. */
    String UNAVAILABLE = "unavailable";
  }

  @SerializedName("available_memory")
  protected Long availableMemory;
  @SerializedName("available_vcpu")
  protected VCPU availableVcpu;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected DedicatedHostGroupReference group;
  protected String href;
  protected String id;
  @SerializedName("instance_placement_enabled")
  protected Boolean instancePlacementEnabled;
  protected List<InstanceReference> instances;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected Long memory;
  protected String name;
  protected DedicatedHostProfileReference profile;
  protected Boolean provisionable;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  @SerializedName("socket_count")
  protected Long socketCount;
  protected String state;
  @SerializedName("supported_instance_profiles")
  protected List<InstanceProfileReference> supportedInstanceProfiles;
  protected VCPU vcpu;
  protected ZoneReference zone;

  /**
   * Gets the availableMemory.
   *
   * The amount of memory in gibibytes that is currently available for instances.
   *
   * @return the availableMemory
   */
  public Long getAvailableMemory() {
    return availableMemory;
  }

  /**
   * Gets the availableVcpu.
   *
   * The available VCPU for the dedicated host.
   *
   * @return the availableVcpu
   */
  public VCPU getAvailableVcpu() {
    return availableVcpu;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the dedicated host was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this dedicated host.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the group.
   *
   * The dedicated host group this dedicated host is in.
   *
   * @return the group
   */
  public DedicatedHostGroupReference getGroup() {
    return group;
  }

  /**
   * Gets the href.
   *
   * The URL for this dedicated host.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this dedicated host.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the instancePlacementEnabled.
   *
   * If set to true, instances can be placed on this dedicated host.
   *
   * @return the instancePlacementEnabled
   */
  public Boolean isInstancePlacementEnabled() {
    return instancePlacementEnabled;
  }

  /**
   * Gets the instances.
   *
   * Array of instances that are allocated to this dedicated host.
   *
   * @return the instances
   */
  public List<InstanceReference> getInstances() {
    return instances;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the dedicated host resource.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the memory.
   *
   * The total amount of memory in gibibytes for this host.
   *
   * @return the memory
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this dedicated host. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the profile.
   *
   * The profile this dedicated host uses.
   *
   * @return the profile
   */
  public DedicatedHostProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the provisionable.
   *
   * Indicates whether this dedicated host is available for instance creation.
   *
   * @return the provisionable
   */
  public Boolean isProvisionable() {
    return provisionable;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this dedicated host.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceType.
   *
   * The type of resource referenced.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the socketCount.
   *
   * The total number of sockets for this host.
   *
   * @return the socketCount
   */
  public Long getSocketCount() {
    return socketCount;
  }

  /**
   * Gets the state.
   *
   * The administrative state of the dedicated host.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the dedicated host on which
   * the unexpected property value was encountered.
   *
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * Gets the supportedInstanceProfiles.
   *
   * Array of instance profiles that can be used by instances placed on this dedicated host.
   *
   * @return the supportedInstanceProfiles
   */
  public List<InstanceProfileReference> getSupportedInstanceProfiles() {
    return supportedInstanceProfiles;
  }

  /**
   * Gets the vcpu.
   *
   * The total VCPU of the dedicated host.
   *
   * @return the vcpu
   */
  public VCPU getVcpu() {
    return vcpu;
  }

  /**
   * Gets the zone.
   *
   * The zone this dedicated host resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

