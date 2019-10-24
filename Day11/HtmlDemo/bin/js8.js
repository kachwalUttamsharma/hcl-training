<<<<<<< HEAD
/**
 * 
 */
function strDemo(){
	var res = "";
	var str = "welcome to html programming ";
	var len = str.length;
	res += "length is " + len + "<br/>";
	res += "lowercase string is <b>" + str.toLowerCase() + "</b><br/>";
	res += "Uppercase string is <b>" + str.toUpperCase() + "</b><br/>";
	res += "First occurence of 'a' is <b>" + str.indexOf("a") + "</b><br/>";
	res += "Char at 5th position is <b>" + str.charAt(5) + "</b><br/>";
	res += "Replaced string is <b>" + str.replace("html","html5") + "</b><br/>";
	
	document.getElementById("res").innerHTML = res;
=======
/**
 * 
 */
function strDemo(){
	var res = "";
	var str = "welcome to html programming ";
	var len = str.length;
	res += "length is " + len + "<br/>";
	res += "lowercase string is <b>" + str.toLowerCase() + "</b><br/>";
	res += "Uppercase string is <b>" + str.toUpperCase() + "</b><br/>";
	res += "First occurence of 'a' is <b>" + str.indexOf("a") + "</b><br/>";
	res += "Char at 5th position is <b>" + str.charAt(5) + "</b><br/>";
	res += "Replaced string is <b>" + str.replace("html","html5") + "</b><br/>";
	
	document.getElementById("res").innerHTML = res;
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
} 