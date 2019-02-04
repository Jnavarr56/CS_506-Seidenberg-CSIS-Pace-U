/*
F = ((AB'+ C)' ⊕ (((CD) ' + B) + A)) '

Using the above Boolean function;

Draw the logic circuit diagram of it
Generate its Truth Table
Test the logic circuit using two sets of sample data; one for F = 0, another for F = 1
 Submit your work as a PDF or Word file.

*/


console.log('BOOLEAN FUNCTION');
console.log("F = ((AB'+ C)' ⊕ (((CD)' + B) + A))' ");
console.log('');
console.log('');


const allBinaryCombinations = n => {

    let result = [];

    for(let y = 0; y < Math.pow(2,n); y++){

        let combo = [];

        for(let x = 0; x < n; x++){
            
            if((y >> x) & 1)

                combo.push(0);

             else 
                combo.push(1);

        }

        result.push(combo);

    }

    return result.sort((a, b) => b.join('') - a.join(''));
}

//GET ALL BINARY PERMUTATIONS OF A COMBINATION OF LENGTH OF 4 (A, B, C, D)
const truthTable = allBinaryCombinations(4);
console.log('TRUTH TABLE');
console.log('');


//PRINT HEADER ROW OF TABLE
console.log(' #  | A | B | C | D |    !(!( ( a && !b ) || c) XOR (( !(c && d) || b) || a))');
console.log('----------------------------------------------------------------------');

truthTable.forEach((combination, i) => {
  
//PASS BINARY COMBINATIONS AS BINARY VARIABLES TO THE BOOLEAN FUNCTION
  let a = combination[0],
      b = combination[1],
      c = combination[2],
      d = combination[3];

  let left = !( ( a && !b ) || c) ? 1 : 0;

  let right = (( !(c && d) || b) || a)  ? 1 : 0;

  let result =  !(left ^ right) ? 1 : 0;


  console.log(` ${i + 1 > 9 ? i + 1 : ' ' + (i + 1)}`+ (' | ' + combination.join(' | ') + ' | ' + '    ' + result).replace(/0/g, 
  'F').replace(/1/g, 'T'));

});

console.log('');
console.log('');
console.log('');
console.log('');
console.log('');


const testData = () => {
  
  const testDataset1 = {
    a: 1,
    b: 1,
    c: 0,
    d: 1,
    row: 3
  };

  const testDataset2 = {
    a: 1,
    b: 0,
    c: 0,
    d: 1,
    row: 7
  };
  
  [testDataset1, testDataset2].forEach((d, i) => {

    console.log(`TEST #${i + 1} FROM ROW ${d.row}`);


    let left = !( ( d.a && !d.b ) || d.c) ? 1 : 0;

    let right = (( !(d.c && d) || d.b) || d.a)  ? 1 : 0;

    let result =  !(left ^ right) ? 1 : 0;

    console.log(`| A | B | C | D |    !( ( ${d.a} && !${d.b} ) || ${d.c}) XOR (( !(${d.c} && ${d.d}) || ${d.b}) || ${d.a})`);
    console.log('----------------------------------------------------------------------');
    console.log(`| ${d.a} | ${d.b} | ${d.c} | ${d.d} |         ${result}`);

    console.log('');
    console.log('');
    

  });


}

testData();


/*
BOOLEAN FUNCTION
F = ((AB'+ C)' ⊕ (((CD)' + B) + A))' 


TRUTH TABLE

 #  | A | B | C | D |    !(!( ( a && !b ) || c) XOR (( !(c && d) || b) || a))
----------------------------------------------------------------------
  1 | T | T | T | T |     F
  2 | T | T | T | F |     F
  3 | T | T | F | T |     T
  4 | T | T | F | F |     T
  5 | T | F | T | T |     F
  6 | T | F | T | F |     F
  7 | T | F | F | T |     F
  8 | T | F | F | F |     F
  9 | F | T | T | T |     F
 10 | F | T | T | F |     F
 11 | F | T | F | T |     T
 12 | F | T | F | F |     T
 13 | F | F | T | T |     T
 14 | F | F | T | F |     F
 15 | F | F | F | T |     T
 16 | F | F | F | F |     T





TEST #1 FROM ROW 3
| A | B | C | D |    !( ( 1 && !1 ) || 0) XOR (( !(0 && 1) || 1) || 1)
----------------------------------------------------------------------
| 1 | 1 | 0 | 1 |         1


TEST #2 FROM ROW 7
| A | B | C | D |    !( ( 1 && !0 ) || 0) XOR (( !(0 && 1) || 0) || 1)
----------------------------------------------------------------------
| 1 | 0 | 0 | 1 |         0

*/