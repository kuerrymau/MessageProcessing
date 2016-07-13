package messageprocessing

import org.codehaus.groovy.grails.web.json.JSONArray
import org.codehaus.groovy.grails.web.json.JSONException
import org.codehaus.groovy.grails.web.json.JSONObject

class JsonMessageController {

    def index() {}

    def processJsonMessage() {
        def message = (String) params.message

        def flashMessage = "Please input valid json string."

        if (message && message.length() > 0) {

            if (!isStringValidJSON(message)) {
                flash.message = flashMessage
            } else {
//                File file = new File('C:\\Users\\Chayanne\\IdeaProjects\\MessageProcessing\\web-app\\resources\\jsonMessage.json')
                File file = new File(grailsApplication.parentContext.getResource('/jsonMessage.json'))
                def sampleJsonText = """ {"header":{"kid":"publisher"},"protected":"eyJhbGciOiJSUzI1NiJ9","signature":"ctWlcvDe3wVxxymYFg2cqhKM5jdQWv0YiuoUtpgwOGdu4AX21rF-tu9XPsIPcUHjyhUIKBrTBFGsooh9GT3_zH41aouhT5VsTXIFXDHj7J54ur-JsA_YW4bL9EXWSdk__7ueamgGUdNjSHRsFv610VtXxXXzGifGKO3EiXkCKTBgXlhCDLXNfzVIr1U09u4wzT4NxitU9iUxVWHlAz5NnRQbKngvWqk8vbpPAjmQpYnU82zKUi4msybcvH_YWN7d68w3Pl8mjfhUdp3OcDCBT1bSfSma1AVBmM4Hr8KPb1kANypg0bdZkYgDTgdabxgX4GDJfvhyxtM0LJ7LcFLDMw"}  """

                def newLine = "\n"

                file << message + newLine

                flash.success = true
            }
        } else {
            flash.message = flashMessage
        }

        redirect(uri: "/")

        return false
    }

    private boolean isStringValidJSON(String jsonString) {
        boolean isStringJSON = true;
        try {
            new JSONObject(jsonString);
        } catch (JSONException ex) {
            try {
                new JSONArray(jsonString);
            } catch (JSONException e) {
                isStringJSON = false;
            }
        }
        return isStringJSON;
    }

}
