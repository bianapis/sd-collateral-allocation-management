/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CollateralAllocationManagementApiService {

	AllocationBaseWithId provide(AllocationBase request);
	
	CollateralAllocationManagementRecordResponse record(String crReferenceId, CollateralAllocationManagementRecordRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	CollateralAssetBaseWithId retrieve(String crReferenceId);
	
	AllocationBaseWithId retrieveAllocations(String crReferenceId, String bqReferenceId);
	
	CollateralAssetBaseWithId update(String crReferenceId, CollateralAssetBase request);
	
}
