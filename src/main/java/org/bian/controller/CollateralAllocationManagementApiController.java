/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Allocate;

@BianRestController
public class CollateralAllocationManagementApiController {

	@Autowired
	CollateralAllocationManagementApiService service;
	
	@Allocate.Provide
	public BianResponse<AllocationBaseWithId> provide(@RequestBody BianRequest<AllocationBase> bianRequest) {
		return BianResponse.forSuccess(service.provide(bianRequest.getData()));
	}
	
	@Allocate.Record
	public BianResponse<CollateralAllocationManagementRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CollateralAllocationManagementRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Allocate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Allocate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Allocate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Allocate.Retrieve
	public BianResponse<CollateralAssetBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("allocations")
	@Allocate.Retrieve
	public BianResponse<AllocationBaseWithId> retrieveAllocations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAllocations(crReferenceId, bqReferenceId));
	}
	
	@Allocate.Update
	public BianResponse<CollateralAssetBaseWithId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CollateralAssetBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
