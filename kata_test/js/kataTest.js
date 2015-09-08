
function Add(numberString) {
  var listNum = numberString.split(/,|\n/);
  var res= 0;
  for(var i=0;i<listNum.length;i++)
      {
        res +=parseInt(listNum[i]);
      }
  alert(res);
}

