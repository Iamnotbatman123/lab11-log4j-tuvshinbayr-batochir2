log4j2.xml file-д rootLevel="info" үед гарсан үр дүн.
<img width="1110" height="381" alt="root_level=info_screenshot" src="https://github.com/user-attachments/assets/f48f2644-74c5-4e93-a654-4d90b3c3f979" />
Customer class-д email-д null дамжуулах үед гарах үр дүн/ Bug of Customer class 
<img width="1092" height="533" alt="NullPointerException_screenshot" src="https://github.com/user-attachments/assets/f42b30ca-cc57-46e8-ae96-1381a7c9db29" />
9. tail ба grep-ийг нэгтгэн WARN мөр бүртгэх
tail -f logs/app.log | grep "WARN" 
<img width="1000" height="74" alt="log_flow_warn" src="https://github.com/user-attachments/assets/302342e9-e019-4cb5-9365-cf360696feb4" />
8. Туршилтын үеэр лог урсгалыг шууд харах
tail -f logs/app.log
<img width="1134" height="396" alt="log_flow_screenshot" src="https://github.com/user-attachments/assets/78fea19e-4b2c-4755-8bb3-c79324001c67" />
11. Тодорхой цаг мөчид үүссэн үйл явдлыг шүүх
grep "2026-04-15 10:" logs/app.log
<img width="1108" height="225" alt="grep_time_screenshot" src="https://github.com/user-attachments/assets/279d9119-9e45-4f2b-aed8-1dcb89182e83" />
7. Бүх ERROR мөрийг шүүж үзэх
grep "ERROR" logs/app.log
<img width="1077" height="191" alt="grep_error_screenshot" src="https://github.com/user-attachments/assets/93774201-cbc3-4691-b608-ea5f7afdc2ae" />
Customer class засагдсан
<img width="1092" height="439" alt="Customer_debugged" src="https://github.com/user-attachments/assets/ec971a42-922e-4ce1-ac08-349b92167657" />
10. awk ашиглан зөвхөн log level-ийн баганыг гаргах
awk '{print $3}' logs/app.log | sort | uniq -c
<img width="1000" height="74" alt="awk_screenshot" src="https://github.com/user-attachments/assets/70be4e8a-6368-46ec-b78a-552b92881442" />


