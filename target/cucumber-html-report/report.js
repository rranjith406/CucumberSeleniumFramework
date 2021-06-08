$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VerifyCreateMachineAPI.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Creation and fetching Machine details",
  "description": "",
  "id": "verify-creation-and-fetching-machine-details",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Creation and fetching Machine details",
  "description": "",
  "id": "verify-creation-and-fetching-machine-details;verify-creation-and-fetching-machine-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I set Machine creation API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I set Machine creation API request URI",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I set machine details like \"\u003cname\u003e\", \"\u003cshortName\u003e\", \"\u003cmachineNumber\u003e\", \"\u003clatitude\u003e\", \"\u003clongitude\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I send HTTP \"POST\" request for Machine creation",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive HTTP Response code as 200 for Machine creation",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify response for successful machine creation",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I set get Machine by Id API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I set get Machine by Id API request URI",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I send HTTP \"GET\" request for getting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I receive HTTP Response code as 200 for getting Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verify machine details like \"\u003cname\u003e\", \"\u003cshortName\u003e\", \"\u003cmachineNumber\u003e\", \"\u003clatitude\u003e\", \"\u003clongitude\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "verify-creation-and-fetching-machine-details;verify-creation-and-fetching-machine-details;",
  "rows": [
    {
      "cells": [
        "name",
        "shortName",
        "machineNumber",
        "latitude",
        "longitude"
      ],
      "line": 19,
      "id": "verify-creation-and-fetching-machine-details;verify-creation-and-fetching-machine-details;;1"
    },
    {
      "cells": [
        "JyoTestMachine6",
        "JyoTest6",
        "77",
        "1.0",
        "1.0"
      ],
      "line": 20,
      "id": "verify-creation-and-fetching-machine-details;verify-creation-and-fetching-machine-details;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1646300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify Creation and fetching Machine details",
  "description": "",
  "id": "verify-creation-and-fetching-machine-details;verify-creation-and-fetching-machine-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I set Machine creation API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I set Machine creation API request URI",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I set machine details like \"JyoTestMachine6\", \"JyoTest6\", \"77\", \"1.0\", \"1.0\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I send HTTP \"POST\" request for Machine creation",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive HTTP Response code as 200 for Machine creation",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify response for successful machine creation",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I set get Machine by Id API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I set get Machine by Id API request URI",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I send HTTP \"GET\" request for getting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I receive HTTP Response code as 200 for getting Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I verify machine details like \"JyoTestMachine6\", \"JyoTest6\", \"77\", \"1.0\", \"1.0\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateMachineAPISteps.i_set_Machine_creation_API_request_header()"
});
formatter.result({
  "duration": 3763679000,
  "status": "passed"
});
formatter.match({
  "location": "CreateMachineAPISteps.i_set_Machine_creation_API_request_URI()"
});
formatter.result({
  "duration": 52300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JyoTestMachine6",
      "offset": 28
    },
    {
      "val": "JyoTest6",
      "offset": 47
    },
    {
      "val": "77",
      "offset": 59
    },
    {
      "val": "1.0",
      "offset": 65
    },
    {
      "val": "1.0",
      "offset": 72
    }
  ],
  "location": "CreateMachineAPISteps.i_set_machine_details_like(String,String,String,String,String)"
});
formatter.result({
  "duration": 663366100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "POST",
      "offset": 13
    }
  ],
  "location": "CreateMachineAPISteps.i_send_HTTP_request_Machine_creation(String)"
});
formatter.result({
  "duration": 8540860400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "CreateMachineAPISteps.i_receive_HTTP_Response_code_as_for_Machine_creation(int)"
});
formatter.result({
  "duration": 4242900,
  "status": "passed"
});
formatter.match({
  "location": "CreateMachineAPISteps.i_verify_response_for_Machine_creation()"
});
formatter.result({
  "duration": 4905936600,
  "status": "passed"
});
formatter.match({
  "location": "GetMachineByIdAPISteps.i_set_get_Machine_by_Id_API_request_header()"
});
formatter.result({
  "duration": 279703700,
  "status": "passed"
});
formatter.match({
  "location": "GetMachineByIdAPISteps.i_set_get_Machine_with_Id_API_request_URI()"
});
formatter.result({
  "duration": 43547100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GET",
      "offset": 13
    }
  ],
  "location": "GetMachineByIdAPISteps.i_send_HTTP_request_for_getting_machine_details(String)"
});
formatter.result({
  "duration": 859964000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "GetMachineByIdAPISteps.i_receive_HTTP_Response_code_as_for_getting_Machine_details_successfully(int)"
});
formatter.result({
  "duration": 376000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JyoTestMachine6",
      "offset": 31
    },
    {
      "val": "JyoTest6",
      "offset": 50
    },
    {
      "val": "77",
      "offset": 62
    },
    {
      "val": "1.0",
      "offset": 68
    },
    {
      "val": "1.0",
      "offset": 75
    }
  ],
  "location": "GetMachineByIdAPISteps.i_verify_machine_details_like(String,String,String,String,String)"
});
formatter.result({
  "duration": 99279300,
  "status": "passed"
});
formatter.after({
  "duration": 68900,
  "status": "passed"
});
formatter.uri("VerifyDeleteMachineAPI.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Machine deletion API",
  "description": "",
  "id": "verify-machine-deletion-api",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify Machine deletion",
  "description": "",
  "id": "verify-machine-deletion-api;verify-machine-deletion",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I set delete machine API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set delete machine API request URI with \"\u003cmachineId\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I send HTTP \"DELETE\" request for deleting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive HTTP Response code as 200 for machine deletion successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify response for successful machine deletion",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "verify-machine-deletion-api;verify-machine-deletion;",
  "rows": [
    {
      "cells": [
        "machineId"
      ],
      "line": 12,
      "id": "verify-machine-deletion-api;verify-machine-deletion;;1"
    },
    {
      "cells": [
        "60bb905fccb0a42849c82a08"
      ],
      "line": 13,
      "id": "verify-machine-deletion-api;verify-machine-deletion;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 972500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Machine deletion",
  "description": "",
  "id": "verify-machine-deletion-api;verify-machine-deletion;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I set delete machine API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set delete machine API request URI with \"60bb905fccb0a42849c82a08\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I send HTTP \"DELETE\" request for deleting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive HTTP Response code as 200 for machine deletion successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify response for successful machine deletion",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteMachineAPISteps.i_set_delete_machine_API_request_header()"
});
formatter.result({
  "duration": 151480300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60bb905fccb0a42849c82a08",
      "offset": 43
    }
  ],
  "location": "DeleteMachineAPISteps.i_set_delete_machine_API_request_URI_with(String)"
});
formatter.result({
  "duration": 243500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DELETE",
      "offset": 13
    }
  ],
  "location": "DeleteMachineAPISteps.i_send_HTTP_request_for_deleting_machine_details(String)"
});
formatter.result({
  "duration": 1320976400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "DeleteMachineAPISteps.i_receive_HTTP_Response_code_as_for_machine_deletion_successfully(int)"
});
formatter.result({
  "duration": 2282000,
  "error_message": "java.lang.AssertionError: expected [200] but found [403]\r\n\tat org.testng.Assert.fail(Assert.java:99)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:1037)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:140)\r\n\tat org.testng.Assert.assertEquals(Assert.java:122)\r\n\tat org.testng.Assert.assertEquals(Assert.java:907)\r\n\tat org.testng.Assert.assertEquals(Assert.java:917)\r\n\tat com.tmos.api.steps.DeleteMachineAPISteps.i_receive_HTTP_Response_code_as_for_machine_deletion_successfully(DeleteMachineAPISteps.java:48)\r\n\tat ✽.Then I receive HTTP Response code as 200 for machine deletion successfully(VerifyDeleteMachineAPI.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DeleteMachineAPISteps.i_verify_response_for_successful_machine_deletion()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 35200,
  "status": "passed"
});
formatter.uri("VerifyGetMachineByIdAPI.feature");
formatter.feature({
  "line": 1,
  "name": "Fetch machine details and verify",
  "description": "",
  "id": "fetch-machine-details-and-verify",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify Machine details fetched succesfully",
  "description": "",
  "id": "fetch-machine-details-and-verify;verify-machine-details-fetched-succesfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I set get Machine by Id API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set get Machine by Id API request URI with \"\u003cmachineId\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I send HTTP \"GET\" request for getting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive HTTP Response code as 200 for getting Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify machine details like \"\u003cname\u003e\", \"\u003cshortName\u003e\", \"\u003cmachineNumber\u003e\", \"\u003clatitude\u003e\", \"\u003clongitude\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "fetch-machine-details-and-verify;verify-machine-details-fetched-succesfully;",
  "rows": [
    {
      "cells": [
        "machineId",
        "name",
        "shortName",
        "machineNumber",
        "latitude",
        "longitude"
      ],
      "line": 12,
      "id": "fetch-machine-details-and-verify;verify-machine-details-fetched-succesfully;;1"
    },
    {
      "cells": [
        "60b9c65d3923fc6bbfafc132",
        "JyoTestMachine6",
        "JyoTest6",
        "06",
        "12.0",
        "12.0"
      ],
      "line": 13,
      "id": "fetch-machine-details-and-verify;verify-machine-details-fetched-succesfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2078900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify Machine details fetched succesfully",
  "description": "",
  "id": "fetch-machine-details-and-verify;verify-machine-details-fetched-succesfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I set get Machine by Id API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set get Machine by Id API request URI with \"60b9c65d3923fc6bbfafc132\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I send HTTP \"GET\" request for getting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I receive HTTP Response code as 200 for getting Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify machine details like \"JyoTestMachine6\", \"JyoTest6\", \"06\", \"12.0\", \"12.0\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "GetMachineByIdAPISteps.i_set_get_Machine_by_Id_API_request_header()"
});
formatter.result({
  "duration": 105467300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60b9c65d3923fc6bbfafc132",
      "offset": 46
    }
  ],
  "location": "GetMachineByIdAPISteps.i_set_get_Machine_by_Id_API_request_URI(String)"
});
formatter.result({
  "duration": 170900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GET",
      "offset": 13
    }
  ],
  "location": "GetMachineByIdAPISteps.i_send_HTTP_request_for_getting_machine_details(String)"
});
formatter.result({
  "duration": 278190600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "GetMachineByIdAPISteps.i_receive_HTTP_Response_code_as_for_getting_Machine_details_successfully(int)"
});
formatter.result({
  "duration": 374400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JyoTestMachine6",
      "offset": 31
    },
    {
      "val": "JyoTest6",
      "offset": 50
    },
    {
      "val": "06",
      "offset": 62
    },
    {
      "val": "12.0",
      "offset": 68
    },
    {
      "val": "12.0",
      "offset": 76
    }
  ],
  "location": "GetMachineByIdAPISteps.i_verify_machine_details_like(String,String,String,String,String)"
});
formatter.result({
  "duration": 8920000,
  "status": "passed"
});
formatter.after({
  "duration": 47700,
  "status": "passed"
});
formatter.uri("VerifyUpdateMachineAPI.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Update Machine API functionality",
  "description": "",
  "id": "verify-update-machine-api-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify Update Machine details successfully",
  "description": "",
  "id": "verify-update-machine-api-functionality;verify-update-machine-details-successfully",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I set Update Machine details API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set Update Machine API request URI with \"\u003cmachineId\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I set updated machine details with \"\u003cname\u003e\", \"\u003cshortName\u003e\", \"\u003cmachineNumber\u003e\", \"\u003clatitude\u003e\", \"\u003clongitude\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I send HTTP \"PUT\" request for updating machine details",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive HTTP Response code as 200 for updating Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I verify response for successful machine updation",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I set get Machine by Id API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I set get Machine by Id API request URI with \"\u003cmachineId\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I send HTTP \"GET\" request for getting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I receive HTTP Response code as 200 for getting Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I verify machine details like \"\u003cname\u003e\", \"\u003cshortName\u003e\", \"\u003cmachineNumber\u003e\", \"\u003clatitude\u003e\", \"\u003clongitude\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "verify-update-machine-api-functionality;verify-update-machine-details-successfully;",
  "rows": [
    {
      "cells": [
        "machineId",
        "name",
        "shortName",
        "machineNumber",
        "latitude",
        "longitude"
      ],
      "line": 19,
      "id": "verify-update-machine-api-functionality;verify-update-machine-details-successfully;;1"
    },
    {
      "cells": [
        "60b9c65d3923fc6bbfafc132",
        "JyoTestMachine6",
        "JyoTest6",
        "06",
        "12.0",
        "12.0"
      ],
      "line": 20,
      "id": "verify-update-machine-api-functionality;verify-update-machine-details-successfully;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 976000,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify Update Machine details successfully",
  "description": "",
  "id": "verify-update-machine-api-functionality;verify-update-machine-details-successfully;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@RegressionDemo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I set Update Machine details API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I set Update Machine API request URI with \"60b9c65d3923fc6bbfafc132\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I set updated machine details with \"JyoTestMachine6\", \"JyoTest6\", \"06\", \"12.0\", \"12.0\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I send HTTP \"PUT\" request for updating machine details",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I receive HTTP Response code as 200 for updating Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I verify response for successful machine updation",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I set get Machine by Id API request header",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I set get Machine by Id API request URI with \"60b9c65d3923fc6bbfafc132\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I send HTTP \"GET\" request for getting machine details",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I receive HTTP Response code as 200 for getting Machine details successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I verify machine details like \"JyoTestMachine6\", \"JyoTest6\", \"06\", \"12.0\", \"12.0\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateMachineDetailsAPISteps.i_set_Update_Machine_details_API_request_header_with()"
});
formatter.result({
  "duration": 113594600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60b9c65d3923fc6bbfafc132",
      "offset": 43
    }
  ],
  "location": "UpdateMachineDetailsAPISteps.i_set_Update_Machine_API_request_URI(String)"
});
formatter.result({
  "duration": 167500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JyoTestMachine6",
      "offset": 36
    },
    {
      "val": "JyoTest6",
      "offset": 55
    },
    {
      "val": "06",
      "offset": 67
    },
    {
      "val": "12.0",
      "offset": 73
    },
    {
      "val": "12.0",
      "offset": 81
    }
  ],
  "location": "UpdateMachineDetailsAPISteps.i_set_updated_machine_details_with(String,String,String,String,String)"
});
formatter.result({
  "duration": 3022800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PUT",
      "offset": 13
    }
  ],
  "location": "UpdateMachineDetailsAPISteps.i_send_HTTP_request_for_updating_machine_details(String)"
});
formatter.result({
  "duration": 297744500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "UpdateMachineDetailsAPISteps.i_receive_HTTP_Response_code_as_for_updating_Machine_details_successfully(int)"
});
formatter.result({
  "duration": 150800,
  "status": "passed"
});
formatter.match({
  "location": "UpdateMachineDetailsAPISteps.i_verify_response_for_Machine_updation()"
});
formatter.result({
  "duration": 72568300,
  "status": "passed"
});
formatter.match({
  "location": "GetMachineByIdAPISteps.i_set_get_Machine_by_Id_API_request_header()"
});
formatter.result({
  "duration": 173902200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60b9c65d3923fc6bbfafc132",
      "offset": 46
    }
  ],
  "location": "GetMachineByIdAPISteps.i_set_get_Machine_by_Id_API_request_URI(String)"
});
formatter.result({
  "duration": 120400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GET",
      "offset": 13
    }
  ],
  "location": "GetMachineByIdAPISteps.i_send_HTTP_request_for_getting_machine_details(String)"
});
formatter.result({
  "duration": 18890800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "GetMachineByIdAPISteps.i_receive_HTTP_Response_code_as_for_getting_Machine_details_successfully(int)"
});
formatter.result({
  "duration": 223400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JyoTestMachine6",
      "offset": 31
    },
    {
      "val": "JyoTest6",
      "offset": 50
    },
    {
      "val": "06",
      "offset": 62
    },
    {
      "val": "12.0",
      "offset": 68
    },
    {
      "val": "12.0",
      "offset": 76
    }
  ],
  "location": "GetMachineByIdAPISteps.i_verify_machine_details_like(String,String,String,String,String)"
});
formatter.result({
  "duration": 3416500,
  "status": "passed"
});
formatter.after({
  "duration": 16300,
  "status": "passed"
});
});