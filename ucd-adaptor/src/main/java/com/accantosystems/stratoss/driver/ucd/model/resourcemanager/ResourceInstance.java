package com.accantosystems.stratoss.driver.ucd.model.resourcemanager;

import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
@JsonInclude(value=JsonInclude.Include.NON_EMPTY, content=JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class ResourceInstance {

	@ApiModelProperty(position=1, example="c675e0bd-9c6c-43ca-84bf-2c061d439c6b", value="Unique identifier for the resource, as generated by the Resource Manager")
	private String resourceId;
	@ApiModelProperty(position=2, example="dev-network", value="Human-readable (non-unique) name given to the resource by the Lifecycle Manager")
	private String resourceName;
	@ApiModelProperty(position=3, example="resource::Network::1.0", value="Type identifier for this resource")
	private String resourceType;
	@ApiModelProperty(position=4, example="ucd", required=false, value="Optional id used to uniquely identify the Resource Manager instance owning this resource")
	private String resourceManagerId;
	@ApiModelProperty(position=5, example="admin@localstack", value="Unique identifier for the specific deployment location for this resource")
	private String deploymentLocation;
	@ApiModelProperty(position=6, value="Key/value pairs for the properties of the resource")
	private final Map<String, String> properties = new TreeMap<>();
	@ApiModelProperty(position=7, required=false, value="Optional date and time this resource type was created")
	private OffsetDateTime createdAt;
	@ApiModelProperty(position=8, required=false, value="Optional date and time this resource type was last modified")
	private OffsetDateTime lastModifiedAt;
	@ApiModelProperty(position=9, required=false, value="Optional array of internal resources comprising this resource")
	private final Set<InternalResourceInstance> internalResourceInstances = new HashSet<>();
	
	public ResourceInstance() {
		super();
	}
	public ResourceInstance(String resourceId, String resourceName, String resourceType, String resourceManagerId,
			String deploymentLocation, OffsetDateTime createdAt, OffsetDateTime lastModifiedAt) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceType = resourceType;
		this.resourceManagerId = resourceManagerId;
		this.deploymentLocation = deploymentLocation;
		this.createdAt = createdAt;
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceManagerId() {
		return resourceManagerId;
	}
	public void setResourceManagerId(String resourceManagerId) {
		this.resourceManagerId = resourceManagerId;
	}
	public String getDeploymentLocation() {
		return deploymentLocation;
	}
	public void setDeploymentLocation(String deploymentLocation) {
		this.deploymentLocation = deploymentLocation;
	}
	public Map<String, String> getProperties() {
		return properties;
	}
	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public OffsetDateTime getLastModifiedAt() {
		return lastModifiedAt;
	}
	public void setLastModifiedAt(OffsetDateTime lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}
	
}
