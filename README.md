# Country_Consumer_Soap_Request_Response

POST :: http://localhost:8084/ws/countryDemo

Request Body ::
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" 
		xmlns:gs="http://io/guides/producing-web-service">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getCountryRequest>
         <gs:name>United Kingdom</gs:name>
      </gs:getCountryRequest>
   </soapenv:Body>
</soapenv:Envelope>


Response Body ::
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:getCountryResponse xmlns:ns2="http://io/guides/producing-web-service">
            <ns2:country>
                <ns2:name>United Kingdom</ns2:name>
                <ns2:population>63705000</ns2:population>
                <ns2:capital>London</ns2:capital>
                <ns2:currency>GBP</ns2:currency>
            </ns2:country>
        </ns2:getCountryResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>

