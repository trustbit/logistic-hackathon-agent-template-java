package com.trustbit.truckagent;

import com.trustbit.truckagent.model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TruckAgentController {

    @PostMapping("/decide")
    public DecideResponse decide(@RequestBody DecideRequest request) {
        // Always deliver the first cargo available, otherwise sleep until one is available
        if(!request.getOffers().isEmpty()) {
            return DecideResponse.deliver(request.getOffers().get(0).getUid());
        }

        return DecideResponse.sleep(1);
    }
}
