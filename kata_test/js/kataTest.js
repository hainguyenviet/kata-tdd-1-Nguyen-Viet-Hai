
function createDifferentDelimeters(numberString)
{
	var delimeters = ",";
	
	if(numberString.indexOf("//") > -1)
		{
			delimeters = numberString.split(/\n/)[0];
			delimeters = delimeters.replace("//", "");
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
  var delimeters = createDifferentDelimeters(numberString);
  var separators = [delimeters,"\n"];
  numberString= replaceDeliNoti(numberString);
  var listNum = numberString.split(new RegExp(separators.join('|'), 'g'));
  var res= 0;
  for(var i=0;i<listNum.length;i++)
      {
	  if(listNum[i]!="")
	  	{
		  res +=parseInt(listNum[i]);
	  	}
      }
  return res;
}

