# YouTubeDataAnalysis
This is a mapreduce implementation to calculate the count of the number of videos posted in different categories of youtube.


---------------
SAMPLE DATA
---------------
QuRYeRnAuXM	EvilSquirrelPictures	1135	Pets & Animals	252	1075	4.96	46	86	gFa1YMEJFag	nRcovJn9xHg	3TYqkBJ9YRk	rSJ8QZWBegU	0TZqX5MbXMA	UEvVksP91kg	ZTopArY7Nbg	0RViGi2Rne8	HT_QlOJbDpg	YZev1imoxX8	8qQrrfUTmh0	zQ83d_D2MGs	u6_DQQjLsAw	73Wz9CQFDtE
3TYqkBJ9YRk	hggh22	1135	Comedy	169	228	5	5	3	QuRYeRnAuXM	gFa1YMEJFag	UEvVksP91kg	rSJ8QZWBegU	nRcovJn9xHg	sVkuOk4jmCo	ZTopArY7Nbg	HT_QlOJbDpg	0RViGi2Rne8	ShhClb6J-NA	g9e1alirMhc	YZev1imoxX8	I4yKEK9o8gA	zQ83d_D2MGs	1GKaVzNDbuI	yuZhwV24PmM	DomumdGQSg8	hiSmlmXp-aU	pFUYi7dp1WU	2l6vwAIAqNU
rSJ8QZWBegU	TimeGem	1135	Entertainment	95	356	4.31	13	1	QuRYeRnAuXM	gFa1YMEJFag	UEvVksP91kg	3TYqkBJ9YRk	nRcovJn9xHg	sVkuOk4jmCo	ZTopArY7Nbg	gBcu22Vv1nY	HT_QlOJbDpg	0RViGi2Rne8	ShhClb6J-NA	g9e1alirMhc	YZev1imoxX8	I4yKEK9o8gA	zQ83d_D2MGs	1GKaVzNDbuI	yuZhwV24PmM	DomumdGQSg8	hiSmlmXp-aU	pFUYi7dp1WU
nRcovJn9xHg	wooochacha	1135	Entertainment	118	1115	2.23	57	73	QuRYeRnAuXM	gFa1YMEJFag	UEvVksP91kg	3TYqkBJ9YRk	ZTopArY7Nbg	gBcu22Vv1nY	HT_QlOJbDpg	0RViGi2Rne8	ShhClb6J-NA	g9e1alirMhc	YZev1imoxX8	I4yKEK9o8gA	zQ83d_D2MGs	1GKaVzNDbuI	yuZhwV24PmM	DomumdGQSg8	hiSmlmXp-aU	pFUYi7dp1WU	2l6vwAIAqNU	WWqed9u6rr4
UEvVksP91kg	johnx113	1135	Entertainment	83	281	2.67	9	16	gFa1YMEJFag	QuRYeRnAuXM	3TYqkBJ9YRk	0TZqX5MbXMA	rSJ8QZWBegU	nRcovJn9xHg	sVkuOk4jmCo	ZTopArY7Nbg	HT_QlOJbDpg	0RViGi2Rne8	g9e1alirMhc	YZev1imoxX8	I4yKEK9o8gA	zQ83d_D2MGs	1GKaVzNDbuI	yuZhwV24PmM	DomumdGQSg8	hiSmlmXp-aU	pFUYi7dp1WU	2l6vwAIAqNU
sVkuOk4jmCo	marcosoycadiz	1135	People & Blogs	49	1196	3.67	6	5	yjt5v88-6Aw	sLrWjhvCoW8	dergWtU1tnE	Cs3TbaYxg_A	OOHsD-akNw0	9Vajm_u9TsI	ZW62z2-QfpA	4ki_fVDDlzs	WJ2WTPtijSc	8TknA5BqRBc	M2fcueuny7s	8Wd6y3Pb2yA	0aKz7qdtMj0	x50W-TW6yGg
ZTopArY7Nbg	TroyChannel	1136	Entertainment	145	11	0	0	0	THM3FYUNyr8	pQPhV1mzh-g	NeIGddkjxJI	8-vZvDjh_3g	N6RuQAW1ALc	Dc_MIs3NzIQ	LsSendGJARs	MHADThckgkE	OTJGrqVOubA	BjU-c_aBXtc	dT1Hmv_2Qg8	apqOIWiKaXc	vX0vqQuXI9g	Gb7ztQ-baqo	VOBH7mtpYh0	gDEx8c11WPQ	JeIHZvZTJTg	g-wwWl5_hPk	hu7n0ccyywY	fbAtMjCZtUU
0RViGi2Rne8	OmnipotentSI	1135	Entertainment	9	490	2.31	26	15	rSJ8QZWBegU	nRcovJn9xHg	0TZqX5MbXMA	UEvVksP91kg	gFa1YMEJFag	QuRYeRnAuXM	3TYqkBJ9YRk	HT_QlOJbDpg	ZTopArY7Nbg	g9e1alirMhc	YZev1imoxX8	I4yKEK9o8gA	zQ83d_D2MGs	1GKaVzNDbuI	yuZhwV24PmM	DomumdGQSg8	hiSmlmXp-aU	pFUYi7dp1WU	2l6vwAIAqNU	WWqed9u6rr4
HT_QlOJbDpg	dumbasstheredneck	1095	Comedy	14	1349	2.09	22	13	cdbp6rCVzRs	jVxz9wKEa3A	mUoRI-VnV6w	bGRB0Pwx_iM	
