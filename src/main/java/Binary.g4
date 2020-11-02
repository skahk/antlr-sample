grammar Binary;

expression: binary {System.out.println($binary.value);}
    |
    NEWLINE;

binary returns [int value]: (binaryDigit [$value] {$value = $binaryDigit.val;})+;

binaryDigit [int value] returns [int val]:
    '1' {$val = $value * 2 + 1;}
    |
    '0' {$val = $value * 2;};


/*

0 -> 0
1 -> 1
10 -> 1*2 + 0
101 -> val(10) * 2 + 1

*/

NEWLINE: '\r'? '\n';
WS: (' '|'\t')+ {skip(); };