package org.egov.fsm.plantmapping.web.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.egov.fsm.web.model.AuditDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder	
public class PlantMapping {


	  @JsonProperty("id")
	  private String id ;
	  
	  @Size(max=64)
	  @JsonProperty("employeeUuid")
	  private String employeeUuid;
	  
	  @Size(max=64)
	  @JsonProperty("plantCode")
	  private String plantCode;
	  
	  @NotNull
	  @Size(min=2,max=64)
	  @JsonProperty("tenantId")
	  private String tenantId ;
	  
	  @JsonProperty("auditDetails")
	  private AuditDetails auditDetails ;
	
	  /**
	   * Gets or Sets status
	   */
	  public enum StatusEnum {
	    ACTIVE("ACTIVE"),
	    
	    INACTIVE("INACTIVE");

	    private String value;

	    StatusEnum(String value) {
	      this.value = value;
	    }
	  }
	  
	  
	  @JsonProperty("status")
	  private StatusEnum status;
}
