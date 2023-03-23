import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ExampleResponse
{
        @JsonProperty("england-and-wales")
        private Division englandAndWales;

        @JsonProperty("northern-ireland")
        private Division northernIreland;

        @JsonProperty("scotland")
        private Division scotland;

        // Constructors, getters, and setters

        /**
         * {
         *   "england-and-wales": {
         *     "division": "england-and-wales",
         *     "events": [
         *       {
         *         "title": "New Year’s Day",
         *         "date": "2018-01-01",
         *         "notes": "",
         *         "bunting": true
         *       },
         *       {
         *         "title": "Good Friday",
         *         "date": "2018-03-30",
         *         "notes": "",
         *         "bunting": false
         *       }
         *     ]
         *   },
         *   "northern-ireland": {
         *     "division": "northern-ireland",
         *     "events": [
         *       {
         *         "title": "New Year’s Day",
         *         "date": "2018-01-01",
         *         "notes": "",
         *         "bunting": true
         *       },
         *       {
         *         "title": "St Patrick’s Day",
         *         "date": "2018-03-19",
         *         "notes": "Substitute day",
         *         "bunting": true
         *       }
         *      ]
         *    },
         *    "scotland": {
         *     "division": "scotland",
         *     "events": [
         *       {
         *         "title": "New Year’s Day",
         *         "date": "2018-01-01",
         *         "notes": "",
         *         "bunting": true
         *       },
         *       {
         *         "title": "2nd January",
         *         "date": "2018-01-02",
         *         "notes": "",
         *         "bunting": true
         *       }
         *      ]
         *     }
         */


}

