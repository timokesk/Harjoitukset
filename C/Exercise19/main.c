/* ========================================
 *
 * Copyright YOUR COMPANY, THE YEAR
 * All Rights Reserved
 * UNPUBLISHED, LICENSED SOFTWARE.
 *
 * CONFIDENTIAL AND PROPRIETARY INFORMATION
 * WHICH IS THE PROPERTY OF your company.
 *
 * ========================================
*/
#include <project.h>
#include <stdio.h>

void get_answer(char *question, char *answer, int max_length);

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    char name[20];
    char address[30];
    char postal_code[20];
    
    get_answer("Enter your name: ", name, 20);
    get_answer("Enter your address: ", address, 30);
    get_answer("Enter postal code: ", postal_code, 20);
    
    printf("Your address is:\n");
    printf("%s", name);
    printf("%s", address);
    printf("%s", postal_code);
    
    for(;;)
    {
        /* Place your application code here. */
    }
}

void get_answer(char *question, char *answer, int max_length) {
    printf("%s", question);
    fgets(answer, max_length, stdin);
    if (answer[strlen(answer) - 1] == '\n') {
        answer[strlen(answer) - 1] = '\0';
    }
}

int _write(int file, char *ptr, int len)
{
    (void)file; /* Parameter is not used, suppress unused argument warning */
	int n;
	for(n = 0; n < len; n++) {
        if(*ptr == '\n') UART_1_PutChar('\r');
		UART_1_PutChar(*ptr++);
	}
	return len;
}

int _read (int file, char *ptr, int count)
{
    int chs = 0;
    char ch;
 
    (void)file; /* Parameter is not used, suppress unused argument warning */
    while(count > 0) {
        ch = UART_1_GetChar();
        if(ch != 0) {
            UART_1_PutChar(ch);
            chs++;
            if(ch == '\r') {
                ch = '\n';
                UART_1_PutChar(ch);
            }
            *ptr++ = ch;
            count--;
            if(ch == '\n') break;
        }
    }
    return chs;
}
/* [] END OF FILE */
