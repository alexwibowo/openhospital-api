package org.isf.admtype.dto;

import javax.validation.constraints.NotNull;

/**
 * Not used anymore
 * @author antonio
 *
 */

public class AdmissionTypeDTO {
	private String code;
	@NotNull
    private String description;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
