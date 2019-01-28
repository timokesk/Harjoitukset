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
#include <string.h>

struct studentRecord {
    char first_name[20];
    char last_name[20];
    int course_credits;
};

int main(void)
{
    CyGlobalIntEnable; /* Enable global interrupts. */

    /* Place your initialization/startup code here (e.g. MyInst_Start()) */
    UART_1_Start();
    
    int number = 5;
    struct studentRecord students[number];
    
    int i = 0;
    do {
        printf("Enter first name of\n");
        printf("student %d: ", i+1);
        scanf("%s", students[i].first_name);
        printf("Enter last name of\n");
        printf("student %d: ", i+1);
        scanf("%s", students[i].last_name);
        printf("Enter number of credits of\n");
        printf("student %d: ", i+1);
        scanf("%d", &students[i].course_credits);
        i++;
    } while (i < number);
    
    printf("\n");
    
    int j;
    for (j = 0; j < number; j++) {
        printf("%-10s %-20s %3d\n", students[j].first_name, students[j].last_name, students[j].course_credits);
    }
    
    for(;;)
    {
        /* Place your application code here. */
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
