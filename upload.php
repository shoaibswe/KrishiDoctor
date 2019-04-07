<?php

require "init.php";
if($con)
{
$title = $_POST['phn'];
$image= $_POST['image'];
$upload_path="uploads/$phn.jpg";
$sql = "insert into imageinfo(phn,path) value('$phn','$upload_path');";


if(mysqli_query($con,$sql))
	{
	file_put_contents($upload_path,base64_decode($image));
	echo json_encode(array('response'=>"Image uploaded"));
	}

else
	{
		echo json_encode(array('response'=>"Image upload Failed!"));
	}
mysql_close($con);
}

?>