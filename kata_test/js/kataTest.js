
function createDifferentDelimeters(numberString)
{
	var delimeters = ",";
	
	if(numberString.indexOf("//") > -1)
		{
			delimeters = numberString.split(/\n/)[0];
			delimeters = delimeters.replace("//", "");
			delimeters = delimeters.replace("][", ",");
		}
	
	return delimeters;
}

function replaceDeliNoti(numberString)
{ 
	if(numberString.indexOf("//") > -1)
		{
			numberString= numberString.replace(numberString.split(/\n/)[0], "");
		}
	
	return numberString;
}

function Add(numberString) {
  var flagNeg =false;
  var negNumList="";
  var delimeters = createDifferentDelimeters(numberString);
  var separators = [delimeters];
  separators.push("\n");
  numberString= replaceDeliNoti(numberString);
  var listNum = numberString.split(new RegExp(separators.join('|'), 'g'));
  var res= 0;
  for(var i=0;i<listNum.length;i++)
      {
	  if(listNum[i]!="")
	  	{
		  if(parseInt(listNum[i])<0)
			  {
			  	flagNeg = true;
			  	negNumList += listNum[i]+","
			  	
			  }
		  else
			  {
			  	if(parseInt(listNum[i])>=1000)
			  		{
			  			res +=0;
			  		}
			  	else
			  		res +=parseInt(listNum[i]);
			  }
			  
	  	}
      }
  if(flagNeg)
	  {
	  	return	"negatives not allowed:"+negNumList;
	  }
  return res;
}

