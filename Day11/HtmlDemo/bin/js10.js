<<<<<<< HEAD
/**
 * 
 */

function show(){
	var res = "";
	var obj = new Date();
	res += "Today's Date " + obj.getDate() + "<br/>";
	var month = obj.getMonth();
	month = month + 1;    //as it's index start from 0
	res += "Month is " +month + "<br/>";
	res += "Year is " + obj.getFullYear() + "<br/>";
	res += "Hours " + obj.getHours() + "<br/>";
	res += "Minutes " + obj.getMinutes() + "<br/>";
	res += "Seconds " + obj.getSeconds() + "<br/>";
	
	document.getElementById("res").innerHTML = res;
=======
/**
 * 
 */

function show(){
	var res = "";
	var obj = new Date();
	res += "Today's Date " + obj.getDate() + "<br/>";
	var month = obj.getMonth();
	month = month + 1;    //as it's index start from 0
	res += "Month is " +month + "<br/>";
	res += "Year is " + obj.getFullYear() + "<br/>";
	res += "Hours " + obj.getHours() + "<br/>";
	res += "Minutes " + obj.getMinutes() + "<br/>";
	res += "Seconds " + obj.getSeconds() + "<br/>";
	
	document.getElementById("res").innerHTML = res;
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}