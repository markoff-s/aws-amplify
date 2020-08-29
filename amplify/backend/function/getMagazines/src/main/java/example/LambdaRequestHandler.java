/* Amplify Params - DO NOT EDIT
	
Amplify Params - DO NOT EDIT */

package example;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaRequestHandler implements RequestHandler<RequestClass, Magazine[]>{   

    public Magazine[] handleRequest(RequestClass request, Context context){
        String title = String.format("Hello %s %s!", request.firstName, request.lastName);
        return new Magazine[] {new Magazine(title)};
    }
}