There are a number of options to query against a list of values in CodeQL.

One method is to inject these values as XML into the codeql database. An example is provided in the `.github/workflows/codeql-analysis.yml` file. 

Once this is done you can query like so: 

``` ql
import java
import semmle.code.xml.XML

from Method method, XmlElement xml
where method.getAParameter().getName() = xml.getTextValue()
select method.getAParameter()
```

Alternatively, if injecting XML is not an option, then you can hardcode the values using a module. For example:

``` ql
import java
import semmle.code.xml.XML

module ParamNames {
  string invalidParamNames() { result = ["username", "password", "harry", "potter"] }
}

from Method method
where method.getAParameter().getName() = ParamNames::invalidParamNames()
select method.getAParameter()
```


