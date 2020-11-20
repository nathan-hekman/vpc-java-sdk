/*
 * (C) Copyright IBM Corp. 2020.
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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionPrototype.
 *
 * Classes which extend this class:
 * - VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype
 * - VPNGatewayConnectionPrototypeVPNGatewayConnectionPolicyModePrototype
 */
public class VPNGatewayConnectionPrototype extends GenericModel {

  /**
   * Routing protocols are disabled for this VPN gateway connection.
   */
  public interface RoutingProtocol {
    /** none. */
    String NONE = "none";
  }

  @SerializedName("admin_state_up")
  protected Boolean adminStateUp;
  @SerializedName("dead_peer_detection")
  protected VPNGatewayConnectionDPDPrototype deadPeerDetection;
  @SerializedName("ike_policy")
  protected IKEPolicyIdentity ikePolicy;
  @SerializedName("ipsec_policy")
  protected IPsecPolicyIdentity ipsecPolicy;
  protected String name;
  @SerializedName("peer_address")
  protected String peerAddress;
  protected String psk;
  @SerializedName("routing_protocol")
  protected String routingProtocol;
  @SerializedName("local_cidrs")
  protected List<String> localCidrs;
  @SerializedName("peer_cidrs")
  protected List<String> peerCidrs;

  protected VPNGatewayConnectionPrototype() {
  }

  /**
   * Gets the adminStateUp.
   *
   * If set to false, the VPN gateway connection is shut down.
   *
   * @return the adminStateUp
   */
  public Boolean adminStateUp() {
    return adminStateUp;
  }

  /**
   * Gets the deadPeerDetection.
   *
   * The Dead Peer Detection settings.
   *
   * @return the deadPeerDetection
   */
  public VPNGatewayConnectionDPDPrototype deadPeerDetection() {
    return deadPeerDetection;
  }

  /**
   * Gets the ikePolicy.
   *
   * Optional IKE policy configuration. The absence of a policy indicates autonegotiation.
   *
   * @return the ikePolicy
   */
  public IKEPolicyIdentity ikePolicy() {
    return ikePolicy;
  }

  /**
   * Gets the ipsecPolicy.
   *
   * Optional IPsec policy configuration. The absence of a policy indicates
   * autonegotiation.
   *
   * @return the ipsecPolicy
   */
  public IPsecPolicyIdentity ipsecPolicy() {
    return ipsecPolicy;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN gateway connection.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the peerAddress.
   *
   * The IP address of the peer VPN gateway.
   *
   * @return the peerAddress
   */
  public String peerAddress() {
    return peerAddress;
  }

  /**
   * Gets the psk.
   *
   * The preshared key.
   *
   * @return the psk
   */
  public String psk() {
    return psk;
  }

  /**
   * Gets the routingProtocol.
   *
   * Routing protocols are disabled for this VPN gateway connection.
   *
   * @return the routingProtocol
   */
  public String routingProtocol() {
    return routingProtocol;
  }

  /**
   * Gets the localCidrs.
   *
   * A collection of local CIDRs for this resource.
   *
   * @return the localCidrs
   */
  public List<String> localCidrs() {
    return localCidrs;
  }

  /**
   * Gets the peerCidrs.
   *
   * A collection of peer CIDRs for this resource.
   *
   * @return the peerCidrs
   */
  public List<String> peerCidrs() {
    return peerCidrs;
  }
}

