grammar LeftRecursive;

exp: a;

a: b 'a';

b: a 'b';



// while(true){}