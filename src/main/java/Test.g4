grammar Test;

jsonObject: '{' STR ':' value '}';

STR: (('a'..'z') | ('A'..'Z'))+;

value: STR
    |
    jsonObject;

WS: [ \t\r\n]+ -> skip;