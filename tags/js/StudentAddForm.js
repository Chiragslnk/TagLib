function validateForm(frm)
{
// you need to complete it on your own
var vName=frm.name.value.trim();
if(vName.length==0)
{
var vNameErrorSection=document.getElementById("nameErrorSection");
vNameErrorSection.innerHTML="Required";
return false;
}
return true;
}