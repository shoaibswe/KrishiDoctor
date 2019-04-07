<?php
$user_name="root";
$user_pass="";
$db_name="imagedb";
$host_name="localhost";
$con = mysqli_connect($host_name,$user_name,$user_pass,$db_name);


if($con)
{
$name = $_POST['name'];
$image= $_POST['image'];
$upload_path="uploads/$name.jpg";
$sql = "insert into imagetable(name) value('$name');";


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