/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CollateralAllocationManagementApiServiceImpl implements CollateralAllocationManagementApiService {

	public AllocationBaseWithId provide(AllocationBase request){
		return JsonReader.read("provide-AllocationBaseWithId.json",new TypeReference<AllocationBaseWithId>(){});
	}
	
	public CollateralAllocationManagementRecordResponse record(String crReferenceId, CollateralAllocationManagementRecordRequest request){
		return JsonReader.read("record-CollateralAllocationManagementRecordResponse.json",new TypeReference<CollateralAllocationManagementRecordResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CollateralAssetBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CollateralAssetBaseWithId.json",new TypeReference<CollateralAssetBaseWithId>(){});
	}
	
	public AllocationBaseWithId retrieveAllocations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AllocationBaseWithId.json",new TypeReference<AllocationBaseWithId>(){});
	}
	
	public CollateralAssetBaseWithId update(String crReferenceId, CollateralAssetBase request){
		return JsonReader.read("update-CollateralAssetBaseWithId.json",new TypeReference<CollateralAssetBaseWithId>(){});
	}
	
}
