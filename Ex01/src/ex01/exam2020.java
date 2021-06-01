/*
#include<stdio.h>
#include<process.h>
void main() {
	FILE* input, * output;
	char name[10];
	int kor, eng, math, bunho, tot;
	if ((input = fopen("sungjuk.dat", "r")) == NULL) {
		printf("Can not open sungjuk.dat\n");
		exit(0);
	}
	output = fopen("result.txt", "w");
	fprintf(output, " 번호 이름 국어 수학 영어 총점 \n");
	fprintf(output, "============================================\n");
	while (fscanf(input, "%d%s%d%d%d", &bunho, name, &kor, &math, &eng) != EOF) {
		tot = kor + math + eng;
		fprintf(output, "%d%-14s%3d%5d%5d%5d\n", bunho, name, kor, math,
			eng, tot);
	}
	fclose(input);
	fclose(output);

}
*/

/*
#include<stdio.h>
int main(void){
	FILE* stream;
	char name[20];
	int  kor, eng, total;

	printf("1. 이름입력: ");
	fscanf(stdin, "%s", name);                   // 키보드로부터 데이터를 입력

	printf("2. 국어점수, 영어점수입력: ");
	fscanf(stdin, "%d %d", &kor, &eng);     // 키보드로부터 데이터를 입력
	total = kor + eng;

	stream = fopen("data5.txt", "w");
	fprintf(stream, "%s %d %d %d \n", name, kor, eng, total);  //data4.txt에 출력
    fprintf(stdout,"%s %d %d %d \n", name, kor, eng, total);     // 모니터에 출력
	fclose(stream);
	return 0;
}
*/


// 파일 입출력2
/*
#include<stdio.h>
#define MAX 100
int main(void){
	FILE* stream;
	char buffer[50];

	stream = fopen("data3.txt", "w");
	if (stream == NULL)
		puts("파일 열기 오류");

	fgets(buffer, sizeof(buffer), stdin);
	fputs(buffer, stream);

	fclose(stream);

	return 0;
}
*/

// 파일 입출력
/*
#include<stdio.h>
int main(void){
	FILE* stream1;    // 읽기 전용 파일 스트림 선언
	FILE* stream2;    // 쓰기 전용 파일 스트림 선언
	int input = 0;

	stream1 = fopen("data1.txt", "r");
	stream2 = fopen("data2.txt", "w");

	puts("파일로부터 데이터를 입력");
	while (input != EOF){
		input = fgetc(stream1);
		fputc(input, stream2);
		fputc(input, stdout);
	}
	fclose(stream1);
	fclose(stream2);
	return 0;
}
*/
/*
#include<stdio.h>
#include<process.h>
void main() {
	FILE* input;
	int bunho;
	char name[15];
	int kor, eng, math, tot;
	if ((input = fopen("sungjuk.dat", "r")) == NULL) {
		printf("Can not open sungjuk.dat￦n");
		exit(0);
	}
	printf(" 번호 이름 국어 수학 영어 총점 ￦n");
	printf("==========================================￦n");
	while (fscanf(input, "%d%s%d%d%d", &bunho, name, &kor, &math, &eng) != EOF) {
		tot = kor + math + eng;
		printf("%3d%15s%5d%5d%5d%6d ￦n", bunho, name, kor, math, eng, tot);
	}
	fclose(input);
}
*/
// 입력 파일 "sungjuk.dat"
/*
#include<stdio.h>
#include<process.h>
void main() {
	FILE* input;
	int bunho;
	char name[15];
	int kor, eng, math, tot;
	if ((input = fopen("sungjuk.dat", "r")) == NULL) {
		printf("Can not open sungjuk.dat￦n");
		exit(0);
	}
//	printf(" 번호 이름 국어 수학 영어 총점 ￦n");
//	printf("==========================================￦n");
	while (fscanf(input, "%d%s%d%d%d", &bunho, name, &kor, &math, &eng) != EOF) {
		tot = kor + math + eng;
		printf("%3d%15s%5d%5d%5d%6d ￦n", bunho, name, kor, math, eng, tot);
	}
	fclose(input);
}
*/

/*
#include<stdio.h>
#include<conio.h>
int main(void){
	char ch, ch1, ch2;
		ch = getchar();
		putchar(ch);
		printf("\n-------------\n");
		ch1 = _getch();
		putchar(ch1);
		printf("\n-------------\n");
		ch2 = _getche();
		putchar(ch2);
		printf("\n-------------\n");
	return 0;
}
*/
/*
#include <stdio.h>
void bubble_sort(int* a, int count){
	int temp;

	for (int i = 0; i < count-1; i++)	{
		for (int j = 0; j < count - i-1; j++){
			if (a[j] > a[j + 1]){
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
}
int main(){
	int numA[10] = { 11,10,8,7,6,5,4,3,2,1 };
	bubble_sort(numA, sizeof(numA) / sizeof(int));
	for (int i= 0; i < 10; i++)	{
		printf("%d ", numA[i]);
	}
	printf("\n");

	return 0;
}
*/

//문자열 함수 
/*
#include<stdio.h>
int main(void){
	char array1[10];
	char array2[10] = "Good luck";

	puts("문자열을 입력하세요");
	gets(array1);          // 문자열 입력
	puts(array1);          // 문자열 출력

	puts(array2);          // 문자열 출력
	puts("Good luck");  // 문자열 출력

	return 0;
}
*/

//문자열 2
/*
#include<stdio.h>
int main(void){
	char array1[20];
	char array2[20];

	gets(array1);                  // what is your name? 입력
	puts(array1);                  // what is your name? 출력

//	scanf_s("%s", array2);         // what is your name? 입력
//	printf("%s\n", array2);     // what 출력

	return 0;
}
*/


// 문자열 3
/*
#include<stdio.h>
#include<string.h>

int main(void){
	char array1[] = "Hello C";
	char array2[] = "안녕하세요";

	printf("영문 문자열의 길이: %d \n", strlen(array1));  // 7 출력
	printf("한글 문자열의 길이  %d \n", strlen(array2));  // 10 출력

	printf("영문 문자열의 길이: %d \n", sizeof(array1));  // 8 출력
	printf("한글 문자열의 길이: %d \n", sizeof(array2));  // 11 출력

	return 0;
}
*/
// 문자열 4
/*
#include<stdio.h>
#include<string.h>

int main(void){
	char array1[12] = "Hello world";
	char array2[12];
	char array3[12];

	strcpy_s(array2, 12, array1);
	strncpy_s(array3, 12, array1, 8);
	

	puts(array2);
	puts(array3);

	return 0;
}
*/

/*
#include<stdio.h>
#include<stdlib.h>
int main(void){
	char* p1 = (char*)malloc(2);
	int* p2 = (int*)malloc(8);

	p1[0] = 'A';    //  *(p1+0) = 'A';
	p1[1] = 'B';    //  *(p1+1) = 'B';
	p2[0] = 10;    //  *(p2+0) = 10;
	p2[1] = 20;    //  *(p2+1) = 20;

	printf("주소: %x %x %x %x \n", &p1[0], &p1[1], &p2[0], &p2[1]);
	printf("  값: %d %d %d %d \n", p1[0], p1[1], p2[0], p2[1]);
	printf("  값: %c %c %d %d \n", p1[0], p1[1], p2[0], p2[1]);

	free(p1);
	p1 = NULL;

	free(p2);
	p2 = NULL;
	return 0;
}
*/
/*
#include<stdio.h>
#include<stdlib.h>
int main(void){
	char* p1 = (char*)malloc(2);
	int* p2 = (int*)malloc(8);

	*(p1+0) = 'A';
	*(p1+1) = 'B';
	*(p2+0) = 10;
	*(p2+1) = 20;

	printf("주소: %x %x %x %x \n", p1 + 0, p1 + 1, p2 + 0, p2 + 1);
	printf("  값: %d %d %d %d \n", *(p1 + 0), *(p1 + 1), *(p2 + 0), *(p2 + 1));
//	printf("  값: %c %c %d %d \n", p1[0], p1[1], p2[0], p2[1]);

	free(p1);
	p1 = NULL;

	free(p2);
	p2 = NULL;
	return 0;
}
*/
/*
#include<stdio.h>
#include<stdlib.h> 
int main(void){
	int* p = NULL;
	p = (int*)malloc(4);

	if (p == NULL)
		printf("힙 영역에 동적 메모리 할당 실패\n");

	*p = 10;
	printf("주소 : %x \n", p);
	printf("  값 : %d \n", *p);

	free(p);
	p = NULL;

	return 0;
}
*/
/*
#include <stdio.h>
#include <stdlib.h>
int main(void){
	int i = 0;
	int* p = (int*)calloc(sizeof(int), sizeof(int));
	if (p == NULL)
		printf("힙 영역에 동적 메모리 할당 실패\n");
	for (i = 0; i < 4; i++)	{
		p[i] = i;        // *(p+i)=i;
		printf("주소: %x \n", &p[i]);
		printf("값: %d \n", p[i]);
	}

	free(p);
	p = NULL;

	return 0;
}
*/


// 삽입 정렬
/*
#include <stdio.h>
void swap(int*, int);
void main(){
	int* data;
	int length;
	int i;
	while (1)	{
		printf("자료의 개수 입력 : ");
		scanf("%d", &length);
		if (length >= 2)	break;
		else				printf("자료의 개수는 2개 이상 입력\n");
	}
	// 동적할당
	data = (int*)calloc(length, sizeof(int));

	for (i = 0; i < length; i++){
		printf("%d번째 자료(수) 입력 : ", i + 1);
		scanf_s("%d", &data[i]);
	}

	printf("입력한 수====================\n");
	for (i = 0; i < length; i++){
		printf("%3d", data[i]);
	}
	printf("\n");
	// 삽입 정렬
	swap(data, length);
	// 삽입 정렬 후 데이터 출력
	printf("삽입 정렬 후=================\n");
	for (i = 0; i < length; i++){
		printf("%3d", data[i]);
	}
	printf("\n");
	free(data);
}

void swap(int* data, int size){
	int key;
	int i, j;

	for (i = 1; i < size; i++)	{
		key = data[i];
		j = i - 1;
		while (j >= 0 && data[j] > key){
			data[j + 1] = data[j];
			j = j - 1;
		}
		data[j + 1] = key;
	}
}
*/


// 배열 최종 정리
/*
#include <stdio.h>
#define STUD 5
#define DATA 8
void swap(int*, int*);
int main(){
	int info[STUD][DATA] = {
		{ 1, 50, 60, 70, 80 },
		{ 2, 80, 40, 90, 70 },
		{ 3, 30, 100, 40, 50 },
		{ 4, 90, 50, 30, 60 },
		{ 5, 100, 70, 90, 90 }
	};
	int f, i, j, k, input;
	// 총점과 평균을 구하고, 석차를 1로 초기화
	for (i = 0; i < STUD; i++){
		for (j = 1; j < 5; j++){
			info[i][5] += info[i][j];	// 총점
		}
		info[i][6] = info[i][5] / 4;	// 평균
		info[i][7] = 1;					// 석차 초기화
	}
	// 석차 구하기
	for (i = 0; i < STUD - 1; i++)	{
		for (j = i + 1; j < STUD; j++){
			if (info[i][5] < info[j][5]) info[i][7]++;
			else info[j][7]++;
		}
	}
	// 버블 정렬
	for (i = 0; i < STUD - 1; i++){
		f = 0;
		for (j = 0; j < STUD - i - 1; j++){
			if (info[j][7] > info[j + 1][7]){
				for (k = 0; k < DATA; k++){
					swap(&info[j][k], &info[j + 1][k]);
				}
				f = 1;
			}
		}
		if (f != 1) break;
	}
	// 출력
	printf("번호 국어 수학 영어 전산 총점 평균 석차\n");
	printf("===========================================\n");
	for (i = 0; i < STUD; i++){
		for (j = 0; j < DATA; j++){
			printf("%4d ", info[i][j]);
		}
		printf("\n");
	}
	// 검색
	while (1)	{
		// 이분법 탐색
		int middle, low = 0, high = STUD - 1;

		printf("원하는 학생의 석차를 입력해서 정보를 확인하시오. (%2d~%2d) : ", 1, STUD);
		scanf_s("%d", &input);
		if (input < 1 || input > STUD) break;

		while (low <= high){
			middle = (low + high) / 2;
			if (input == info[middle][7]) break;
			else if (info[middle][7] > input) high = middle - 1;
			else low = middle + 1;
		}
		printf("번호 국어 수학 영어 전산 총점 평균 석차\n");
		printf("===========================================\n");
		for (i = 0; i < DATA; i++){
			printf("%4d ", info[middle][i]);
		}
		printf("\n");

		
	}
}

void swap(int* a, int* b){
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}
*/


// 구조체 실습
/*
#include<stdio.h>
struct score {
	int num;
	char name[8];
	int kor;
	int eng;
	int math;
	int total;
	float avg;
	char grade;
	int rank;
};
int main() { 

//	struct score member0 = { 1,"김경민",89,75,60 };
//	struct score member1 = { 2,"노순희",67,56,80 };
//	struct score member4 = { 3,"민은희",90,100,89 };
	struct score member[5] = {
			{1,"김경민",90,95,50},
			{2,"노순희",67,56,77},
			{3,"민은희",90,100,89},
			{4,"이은하",75,86,96},
			{5,"황은영",90,89,79}
	};
	int i, j, sw;
	struct score temp;
	struct score* point;
	point = member;

	for (i = 0; i < 5; i++) {
		member[i].total = member[i].kor+ member[i].eng + member[i].math  ;
		member[i].avg = member[i].total / 3.0;
		member[i].rank = 1;
	}

	for (i = 0; i < 5; i++) {
		if (member[i].avg >= 90 && member[i].avg <= 100)
			member[i].grade = 'A';
		else if (member[i].avg >= 80 && member[i].avg <90)
			member[i].grade = 'B';
		else if (member[i].avg >= 70 && member[i].avg < 80)
			member[i].grade = 'C';
		else if (member[i].avg >= 60 && member[i].avg < 70)
			member[i].grade = 'D';
		else if (member[i].avg >= 0 && member[i].avg < 60)
			member[i].grade = 'F';
		else 
			member[i].grade = 'X';
//			printf("입력자료 확인 하세요 \n");
	}
	// 선택 정렬 원리 이용
	for (i = 0; i < 4; i++) {
		for (j = i + 1; j < 5; j++) {
			if (member[i].avg > member[j].avg)
				member[j].rank++;
			else if (member[i].avg < member[j].avg)
				member[i].rank++;
			else
				continue;
		}
	}
	printf("===========정렬 전 자료===========================\n");
	printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급\t석차\n");
	printf("==================================================\n");
	for (i = 0; i < 5; i++) {
		printf("%3d\t%3s\t%3d\t%3d\t%3d\t%3d\t%.2f\t%3c\t%3d\n", member[i].num, member[i].name, member[i].kor, member[i].eng, member[i].math, member[i].total, member[i].avg, member[i].grade, member[i].rank);
	}
	
	// 버블정렬 시작
	//for (i = 0; i < 4; i++) {
	//	sw = 0;
	//	for (j = 0; j < 5-1-i; j++) {
	//		if (member[j].rank > member[j+1].rank) {
	//			temp = member[j];
	//			member[j] = member[j+1];
	//			member[j+1] = temp;
	//			sw = 1;
	//		}
	//	}
	//	if (sw == 0)break;
	//}
	// 버블정렬 끝

	// 삽입정렬 시작
	for (i = 0; i < 4; i++) {      //  for( i = 1; i < 5;i++){
		temp = member[i+1];  //     temp=member[i];
		for (j = i; j >= 0; j--) {  //     for( j=i-1; j>=0 ; j--){
			if (temp.rank < member[j].rank) {
				member[j + 1] = member[j];
			}
			else break;
		}
		member[j + 1] = temp;
	}
	//  삽입정렬 끝

	// 자료 출력
	//printf("===========정렬 후 자료===========================\n");
	//printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급\t석차\n");
	//printf("==================================================\n");
	//for (i = 0; i < 5; i++) {
	//	printf("%3d\t%3s\t%3d\t%3d\t%3d\t%3d\t%.2f\t%3c\t%3d\n", member[i].num, member[i].name, member[i].kor, member[i].eng, member[i].math, member[i].total, member[i].avg, member[i].grade, member[i].rank);
	//}
	// 자료출력 끝

	// 자료 출력 포인터 이용
	printf("===========정렬 후 자료===========================\n");
	printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급\t석차\n");
	printf("==================================================\n");
	for (i = 0; i < 5; i++) {
	printf("%3d\t%3s\t%3d\t%3d\t%3d\t%3d\t%.2f\t%3c\t%3d\n", point->num, point->name, point->kor, point->eng, point->math, point->total, point->avg, point->grade, point->rank);
	point++;
	} 
	// 자료 출력 포인터 이용 끝


	
	return 0;
}
*/




// 구조체 시작
/*
#include <stdio.h>
struct group{
	int a;
	double b;
};
int main(){
	struct group g1;    	       // 구조체 변수 g1 선언

	g1.a = 10;                      // 구조체 변수로 멤버 변수 접근
	g1.b = 1.1234;                // 구조체 변수로 멤버 변수 접근

	printf("g1.a의 값: %d \n", g1.a);
	printf("g1.b의 값: %f \n", g1.b);
	return 0;
}
*/

// 구조체 시작2
/*
#include <stdio.h>
struct group{
	int a;
	double b;
}g1;
int main(){
	g1.a = 20;                      // 구조체 변수로 멤버 변수 접근
	g1.b = 10.1234;                // 구조체 변수로 멤버 변수 접근

	printf("g1.a의 값: %d \n", g1.a);
	printf("g1.b의 값: %f \n", g1.b);
	return 0;
}
*/

// 구조체 시작3
/*
#include <stdio.h>
struct group{
	int a;
	double b;
};
int main(){
	struct group g1;
	scanf_s("%d %lf", &g1.a, &g1.b);

	printf("g1.a의 값: %d \n", g1.a);
	printf("g1.b의 값: %f \n", g1.b);
	return 0;
}
*/

// 구조체 시작4
/*
#include <stdio.h>
struct group{
	int a;
	int b;
};
int main(){
	struct group g1 = { 10,20 };    	      // 구조체 변수의 초기화

	printf("g1.a의 값: %d,  g1.b의 값: %d\n", g1.a, g1.b);
	
	return 0;
}
*/


// 구조체 시작5
/*
#include <stdio.h>
struct group{
	int a;
	int b;
};
int main(){
	struct group g1 = { 10,15 };    	      // 구조체 변수의 초기화
	struct group g2 = { 30,40 };
	struct group g3 = { 0, 0 };

	printf("g1.a의 값: %d,  g1.b의 값: %d\n", g1.a, g1.b);
	printf("g2.a의 값: %d,  g2.b의 값: %d\n", g2.a, g2.b);
	printf("g3.a의 값: %d,  g3.b의 값: %d\n", g3.a, g3.b);

	g3.a = g2.a - g1.a;
	g3.b = g2.b - g1.b;
	printf("g3.a의 값: %d,  g3.b의 값: %d\n", g3.a, g3.b);


	return 0;
}
*/

// 구조체 시작6
/*
#include <stdio.h>
struct group{
	int a;
	int b;
};
int main(){
	int a = 3, b=0;
	struct group g1 = { 10,15 };    	      // 구조체 변수의 초기화
	struct group g3 = { 0, 0 };
	printf("a의 값: %d,  b의 값: %d\n", a, b);
	b = a;
	printf("a의 값: %d,  b의 값: %d\n", a, b);
	printf("--------------\n");
	
	printf("g1.a의 값: %d,  g1.b의 값: %d\n", g1.a, g1.b);
	printf("g3.a의 값: %d,  g3.b의 값: %d\n", g3.a, g3.b);

	g3 = g1;
	printf("--------------\n");
	printf("g1.a의 값: %d,  g1.b의 값: %d\n", g1.a, g1.b);
	printf("g3.a의 값: %d,  g3.b의 값: %d\n", g3.a, g3.b);


	return 0;
}
*/

// 구조체 시작7
/*
#include <stdio.h>
struct group{
	int a;
	int b;
};
int main(){
	struct group g1 = { 10,15 };    	      // 구조체 변수의 초기화
	struct group g3 = { 0, 0 };
	
	printf("g1.a의 값: %d,  g1.b의 값: %d\n", g1.a, g1.b);
	printf("g3.a의 값: %d,  g3.b의 값: %d\n", g3.a, g3.b);
	printf("--------------\n");
//	g3 + g1;   // 구조체 변수 간 산술연산 불가능
//	g3 - g1;   // 구조체 변수 간 산술연산 불가능
	g3.a = g1.a + g3.a;
	printf("g1.a의 값: %d,  g3.a의 값: %d\n", g1.a, g3.a);
	printf("g1.b의 값: %d,  g3.b의 값: %d\n", g1.b, g3.b);
	printf("--------------\n");
	g3.b = g1.b - g3.b;
	printf("g1.a의 값: %d,  g3.a의 값: %d\n", g1.a, g3.a);
	printf("g1.b의 값: %d,  g3.b의 값: %d\n", g1.b, g3.b);
	

	return 0;
}
*/


// 포인터
// 포인터 변수의 선언과 사용 --[3-2.c 실습]
/*
#include <stdio.h>
int main(void){
	// 포인터 변수 선언
	char* cp = NULL;
	int* ip = NULL;

	printf("%x %x %x\n", &cp, cp, *&cp);
	printf("%x %x %x\n", &ip, ip, *&ip);

	printf("%d %d \n", sizeof(char*), sizeof(int*));	// 4, 4 출력
	printf("%d %d \n", sizeof(cp), sizeof(ip));	// 4, 4 출력
	return 0;
}
*/
/*
#include <stdio.h>
int main(){
	char c = 'A';
	char* cp = NULL;

	cp = &c;  // 주소 저장

	printf("%x %c %c \n", &c, c, *&c);
	printf("%x %x %x \n", &cp, cp, *&cp);

	printf("%c \n", c);	   // 직접 접근
	printf("%c \n", *cp);  // 간접 접근
	return 0;
}
*/


// 2차원 배열의 주소와 값의 참조 
/*
2차원 배열의 다양한 주소 표현
‘2차원 배열 이름은 2차원 배열의 시작 주소이다.’

^^ ‘2차원 배열의 행의 요소는 행을 대표하는 주소이다.’

^^ ‘2차원 배열에서 array[i] == *(array + i)==array + i 는 주소이다.’
*/
/*
#include<stdio.h>
int main(void){
	int array[2][2] = { 10,20,30,40 };
	printf("array[0]=%x, &array[0][0]=%x\n", array[0], &array[0][0]);
	printf("array[1]=%x, &array[1][0]=%x\n", array[1], &array[1][0]);

	printf("(array+0)=%x\n", array+0 );
	printf("(array+1)=%x\n", array + 1);

	printf("*(array + 0)=%x\n", *(array + 0));
	printf("*(array + 1)=%x\n", *(array + 1));

	return 0;
}
*/
// 2차원 배열에서 array[i] == *(array+i)는 주소이다.’ 
/*
#include<stdio.h>
int main(void){
	int array[2][2] = { 10,20,30,40 };

	printf("%x %x %x\n", array[0], *(array + 0), *array);
	printf("%x %x \n", array[1], *(array + 1));
	printf("%x \n", (array + 1));
	return 0;
}
*/
// 2차원 배열의 주소와 값의 참조---[2-10.c 실습]
/*
#include<stdio.h>
int main(void){
	int array[2][2] = { 10,20,30,40 };

	printf("%x %x \n", &array[0][0], &array[0][1]);
	printf("%x %x \n", &array[1][0], &array[1][1]);

	printf("-------------------\n");
	printf("%x %x \n", array[0] + 0, array[0] + 1);
	printf("%x %x \n", array[1] + 0, array[1] + 1);

	printf("-------------------\n");
	printf("%x %x \n", *(array + 0) + 0, *(array + 0) + 1);
	printf("%x %x \n", *(array + 1) + 0, *(array + 1) + 1);
	return 0;
}
*/
// 2차원 배열의  값의 참조 --[2-10.c 실습]
/*
#include<stdio.h>
int main(void){
	int array[2][2] = { 10,20,30,40 };
	printf("%x %x \n", *&array[0][0], *&array[0][1]);
	printf("%x %x \n", *&array[1][0], *&array[1][1]);

	printf("-------------------\n");
	printf("*array[0] + 0=%x, *array[0] + 1=%x \n", *array[0] + 0, *array[0] + 1);
	printf("*array[1] + 0=%x, *array[1] + 1=%x \n", *array[1] + 0, *array[1] + 1);

	printf("-------------------\n");
	printf("%x %x \n", **(array + 0) + 0, **(array + 0) + 1);
	printf("%x %x \n", **(array + 1) + 0, **(array + 1) + 1);
	return 0;
}
*/

// 2차원 배열의  값의 참조 ---[2-10.c 실습]
/*
#include<stdio.h>
int main(void){
	int array[2][2] = { 10,20,30,40 };
	printf("%d , *&array[0][1]=%d \n", *&array[0][0], *&array[0][1]);
	printf("%d %d \n", *&array[1][0], *&array[1][1]);
	printf("-------------------\n");
	printf("%d , array[0][1]=%d \n", array[0][0], array[0][1]);
	printf("%d %d \n", array[1][0], array[1][1]);
	printf("-------------------\n");
	printf("*(array[0] + 0)=%d, *(array[0] + 1)=%d \n", *(array[0] + 0), *(array[0] + 1));
	printf("*(array[1] + 0)=%d, *(array[1] + 1)=%d \n", *(array[1] + 0), *(array[1] + 1));
	printf("-------------------\n");
	printf("%d , *(*(array + 0) + 1)=%d \n", *(*(array + 0) + 0), *(*(array + 0) + 1));
	printf("%d , *(*(array + 1) + 1)=%d \n", *(*(array + 1) + 0), *(*(array + 1) + 1));
	return 0;
}
*/

// 배열
// 1차원 배열의 주소와 값의 참조 ---[1-9.c 실습]
/*
#include<stdio.h>
int main(){
	int array[3] = { 10,20,30 };

	printf("%x %x %x \n", array + 0, array + 1, array + 2);
	printf("%d, *(array + 1)= %d, %d \n", *(array + 0), *(array + 1), *(array + 2));
	printf("%d,  *array + 1= %d, %d \n", *array + 0, *array + 1, *array + 2);
	printf("%d,   array[1]= %d, %d \n", array[0], array[1], array[2]);
	printf("*(array + 0)=%d, ==, *array=%d \n", *(array + 0), *array);

	return 0;
}
*/
// 수학 함수
/*
#include<stdio.h>
#include<math.h>
int main(){
	printf("25의 제곱근_sqrt(25) = %.2f\n", sqrt(25));
	printf("5의 3제곱_pow(5, 3) = %.2f\n", pow(5, 3));
	printf("5.4의 소수버림결과 _floor(5.4)= %f\n", floor(5.4));
	printf("5.4의 소수올림결과 _ceil(5.4)= %f\n", ceil(5.4));
	printf("-5.4의 소수버림결과 = %f\n", floor(-5.4));
	printf("-5.4의 소수올림결과 = %f\n", ceil(-5.4));
	printf("5의 절대값_abs(5) = %d\n", abs(5));
	printf("-5의 절대값_abs(-5) = %d\n", abs(-5));
	printf("5.4의 반올림결과 _round(5.4)= %f\n", round(5.4));
	printf("5.4의 반올림결과 _round(5.6)= %f\n", round(5.6));
	printf("-5.4의 반올림결과 _round(-5.4)= %f\n", round(-5.4));
	printf("-5.4의 반올림결과 _round(-5.6)= %f\n", round(-5.6));

	
	return 0;
}
*/
// 매크로 시험용은 아님
/*
#include<stdio.h>
#define N 5+2
int main() {
	int result;
	result = N * N;
	printf("result : 5 + 2 * 5 + 2=%d \n", result);
//	printf("result : (5 + 2) * (5 + 2)=%d \n", result);
	printf("result=%d \n", result);
	
	return 0;
}
*/

// 10진수를 2진수로 진법변환-4_알고리즘
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, dec, id, mok, na, cnt;
	int arr1[NUM+1];

	while (1) {
		for (i = 0; i < NUM; i++) {
			arr1[i] = 0;
		}

		printf("dec 입력하시오=  단 1:종료 ");
		scanf_s("%d", &dec);
		if (dec == 1)break;
		id = dec;
		for (i = NUM; i >= 1; i--) {
			mok = dec / 2;
			na = dec % 2;
			cnt = cnt + 1;
			arr1[i] = na;

			dec = mok;
			if (mok ==0)break;
		}

		printf("10진수 값=%4d\n", id);
		for (i = 1; i <= NUM; i++) {
			printf("%2d", arr1[i]);
		}
		printf("\n");
	}

	system("pause");
	return 0;
}
*/

// 10진수를 2진수로 진법변환-3_알고리즘
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, dec, id, mok, na, cnt;
	int arr1[NUM+1];

	while (1) {
		for (i = 1; i <= NUM; i++) {
			arr1[i] = 0;
		}
		cnt = 0;
		printf("dec 입력하시오=  단 1:종료 ");
		scanf_s("%d", &dec);
		if (dec == 1)break;
		id = dec;
		for (i = 1; i <= NUM; i++) {
			if (dec == 0)break;
			mok = dec / 2;
			na = dec % 2;
			cnt = cnt + 1;
			arr1[NUM+1-cnt] = na;

			dec = mok;

		}

		printf("10진수 값=%4d\n", id);
		for (i =0; i < NUM; i++) {
			printf("%2d", arr1[i]);
		}
		printf("\n");
	}


	return 0;
}
*/


// 10진수를 2진수로 진법변환-2_알고리즘
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, dec, id, mok, na, cnt, k;
	int arr1[NUM+1];

	while (1) {
		for (i = 0; i < NUM; i++) {
			arr1[i] = 0;
		}
		cnt = 0;
		printf("dec 입력하시오=  단 1:종료 ");
		scanf_s("%d", &dec);
		if (dec == 1)break;
		id = dec;
		for (i = 0; i < NUM; i++) {
			mok = dec / 2;
			na = dec % 2;
			cnt = cnt + 1;
			arr1[1+NUM-cnt] = na;
			dec = mok;
			if (mok == 0)break;
		}

		printf("10진수 값=%4d\n", id);
		k = 1 + NUM - cnt;
		for (i =k ; i <= NUM; i++) {
			printf("%2d", arr1[i]);
		}
		printf("\n");
	}


	return 0;
}
*/


// 10진수를 2진수로 진법변환-1_알고리즘
// 10진수를 n진수로 진법변환
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, dec, id, mok, na, cnt;
	int arr1[NUM+1];

	while (1) {

		for (i = 1; i <= NUM; i++) {
			arr1[i] = 0;
		}


		cnt =1;
		printf("dec 입력하시오=  단 1:종료 ");
		scanf_s("%d", &dec);
		if (dec == 1)break;
		id = dec;
		for  (i =1; i <= NUM; i++) {
			mok = dec / 2;
			na = dec % 2;
			cnt = cnt + 1;
			arr1[cnt] = na;

			dec = mok;
			if (mok == 0)break;
		}
		printf("10진수 값=%4d\n", id);
		for (i = NUM; i >= 1; i--) {
			printf("%2d", arr1[i]);
		}
		printf("\n");
	}


	return 0;
}
*/

//최대 공약수 최소 공약수
/*
#include <stdio.h>
int main(){
	int a, b, large, small, gcm, lcm, mok, na;
	while (1) {
		printf("a를 입력하시오= .  9999:종료");
		scanf_s("%d", &a);
		if (a == 9999)break;
		printf("b를 입력하시오= ");
		scanf_s("%d", &b);

		if (a > b) {
			large = a;
			small = b;
		}
		else {
			large = b;
			small = a;
		}
		while (1) {
			mok = large / small;  // mok = int(large / small);
			na = large % small;  // na = large - mok * small;

			if (na == 0) {
				gcm = small;
				break;
			}
			else {
				large = small;
				small = na;
				continue;
			}
		}

		lcm = a * b / gcm;
		printf("최대 공약수 :%3d\n", gcm);
		printf("최소 공배수 :%3d\n", lcm);
	}
	
	return 0;
}
*/

// 소인수 분해하기
/*
#include<stdio.h>
int main() {
	int i, dec, id, mok, na, cnt, k;
	int arr1[50];
	while (1) {
		printf("dec 입력하시오=  9999:종료 ");
		scanf_s("%d", &dec);
		if (dec == 9999)break;
		for (i = 0; i < 50; i++) {
			arr1[i] = 0;
		}
		cnt = -1;
		id = dec;
		do{
			k = 2;
			while (1) {
				mok = dec / k;
				na = dec % k;
				if (na != 0) {
					k = k + 1;
				}
				else {
					break;
				}
			}
			cnt = cnt + 1;
			arr1[cnt] = k;
			dec = mok;
	//		if (mok == 1)break;
		} while (mok > 1);
		printf("입력정수=%2d\n", id);
		for (i = 0; i < cnt; i++) {
			printf("%2d * ", arr1[i]);
		}
		printf("%2d", arr1[cnt]);
		printf("\n");
	}
	
	return 0;
}
*/
//소인수 분해
/*
int main(){
	int num, i;
	printf("소인수 분해할 수 입력: ");
	scanf("%d", &num);

	for (i = 2; i <= num; i++){
		while (num>1){
			if (num%i == 0){
				printf("%d ", i);
				num= num / i;
			}
			else
				break;
		}

	}
}
*/

// 소수-5
/*
#include<stdio.h>
int main(void) {
	int i, j, num, na, cnt, sum;
	int a[50];
	while (1) {
		for (i = 0; i < 50; i++) {
			a[i] = 0;
		}
		cnt = 0;
		sum = 0;
		printf("입력 :  9999:중지 ");
		scanf_s("%d", &num);
		if (num == 9999)break;
		printf("입력 받은 수=%d \n", num);
		for (i = 2; i <= num; i++) {
			for (j = 2; j <= i; j++) {
				na = i % j;
				if (na == 0) {
					if (i == j) {
						cnt = cnt + 1;
						sum = sum + i;
						a[cnt] = i;
						break;
					}
					else {
						break;
					}
				}
			}
		}
		printf("----------------- \n");
		for (i = 1; i <= cnt; i++) {
			printf("%3d ", a[i]);
		}
		printf("\n----------------- \n");
		printf("cnt=%2d , sum=%3d \n", cnt, sum);
	}

	
	return 0;
}
*/
// 소수-4
/*
#include<stdio.h>
int main(void) {
	int i, j, num, na, cnt=0, sum=0;
	int a[50] = { 0 };
	printf("입력 : ");
	scanf_s("%d", &num);
	printf("입력 받은 수=%d \n", num);
	for (i = 2; i <= num; i++) {
		for (j = 2; j <= i; j++) {
			na = i % j;
			if (na == 0) {
				if (i == j) {
					cnt = cnt + 1;
					sum = sum + i;
					a[cnt] = i;

			//		printf("cnt=%3d , i=%3d \n", cnt, i);
					break;
				}
				else {
					break;
				}
			}
		}
	}
	printf("----------------- \n");
	for (i = 1; i <= cnt; i++) {
		printf("%3d ", a[i]);
	}
	printf("\n----------------- \n");
	printf("cnt=%2d , sum=%3d \n", cnt, sum);

	
	return 0;
}
*/
// 소수-3
/*
#include<stdio.h>
int main(void) {
	int i, j, num, na, cnt=0, sum=0;
	printf("입력 : ");
	scanf_s("%d", &num);
	printf("입력 받은 수=%d \n", num);
	for (i = 2; i <= num; i++) {
		for (j = 2; j <= i; j++) {
			na = i % j;
			if (na == 0) {
				if (i == j) {
					cnt = cnt + 1;
					sum = sum + i;
					printf("cnt=%3d , i=%3d \n", cnt, i);
					break;
				}
				else {
					break;
				}
			}
		}
	}
	printf("----------------- \n");
	printf("cnt=%2d , sum=%3d \n", cnt, sum);

	
	return 0;
}
*/
// 소수-2
/*
#include<stdio.h>
#include<math.h>
int main(void) {
	int j, num, na;
	while (1) {
		printf("입력 :  단 1: 종료 ");
		scanf_s("%d", &num);
		if (num == 1)break;
		printf("입력 받은 수=%d \n", num);
		for (j = 2;  j <= sqrt(num); j++) {
			na = num % j;
			if (na == 0) {
				printf("%d 수는 소수 아님\n", num);
				goto AA;
			}
		}
		printf("%d 수는소수 발견\n", num);
	AA:;
	}
	
	return 0;
}
*/
// 소수-1  
/*
#include<stdio.h>
int main(void) {
	int j, num, na;
	while (1) {
		printf("입력 :  단 1: 종료 ");
		scanf_s("%d", &num);
		if (num == 1)break;
		printf("입력 받은 수=%d \n", num);
		for (j = 2; j <= num-1; j++) {
			na = num % j;
			if (na == 0) {
				printf("%d 수는 소수 아님\n", num);
				goto AA;
			}
		}
		printf("%d 수는소수 발견\n", num);
AA: ;
	}
	
	return 0;
}
*/

//약수   6 -> 1, 2, 3, 6
/*
#include<stdio.h>
int  main(){
	int i, k, num, cnt = 0, mok, na;
	int a[100];
	while (1) {
		for (i = 0; i < 100; i++) {
			a[i] =0;
		}
		cnt = 0;
		printf("약수를 구할 숫자를 입력하시오... 9999 종료 ");
		scanf_s("%d", &num);
		if (num == 9999)break;
		printf("입력 받은 수=%d \n", num);
		for (k = 1; k <= num; k++) {
			na = num % k;
			if (na == 0) {
				cnt = cnt + 1;
				a[cnt] = k;
			}
		}
		for (i =1; i <=cnt ; i++) {
			printf("cnt=%2d , a[%2d]= %3d \n", i, i, a[i]);
		}
	}

	
	return 0;
}
*/
// 50에 가장 가까운 값 출력하기
/*
#include<stdio.h>
#define NUM 7
#define FIND 50
int  main() {
	int a[NUM] = { 51, 99, 1, 34, 49, 34, 56 };
	int i, min, diff, k;
	min = 5555555;
	for (i = 0; i < NUM; i++) {
		if (a[i] < FIND) {
			diff = FIND - a[i];
		}
		else {
			diff = a[i] - FIND;
		}
		if (min > diff) {  // if (min >= diff)
			min = diff;
			k = a[i];
		}
	}
	printf("50 근사값:%3d\n", k);

	
	return 0;
}
*/
//최대값, 최소값-2
/*
#include<stdio.h>
#define NUM 7
int  main() {
	int a[NUM] = { 50, 99, 1, 34, 50, 34, 56 };
	int i, max, min, cnt=1, sum=0;
	float avg;
	max = a[0];
	min = a[0];
	sum = a[0];
	for (i = 1; i < NUM; i++) {
		if (max < a[i]) {
			max = a[i];
		}
		if (min > a[i]) {
			min = a[i];
		}
		cnt = cnt + 1;
		sum = sum + a[i];
	}
	sum = sum - (max + min);
	avg = (float)sum /(cnt-2); // avg = (float)sum / (NUM-2);
	printf("---- 입력 자료 출력---------\n");
	for (i = 0; i < NUM; i++) {
		printf("%5d", a[i]);
	}
	printf("\n------------------------------\n");
	printf("최대값:%3d\n", max);
	printf("최소값:%3d\n", min);
	printf("합:%3d, 평균:%.2f\n", sum, avg);

	
	return 0;
}
*/
//최대값, 최소값-1
/*
#include<stdio.h>
#define NUM 7
int  main() {
	int a[NUM] = { 50, 99, 1, 34, 50, 34, 56 };
	int i, max, min, cnt=0, sum=0;
	float avg;
	max = 0;
	min = 55555555;
	for (i = 0; i < NUM; i++) {
		if (max < a[i]) {
			max = a[i];
		}
		if (min > a[i]) {
			min = a[i];
		}
		cnt = cnt + 1;
		sum = sum + a[i];
	}
	sum = sum - (max + min);
	avg = (float)sum /(cnt-2); // avg = (float)sum / (NUM-2);
	printf("---- 입력 자료 출력---------\n");
	for (i = 0; i < NUM; i++) {
		printf("%5d", a[i]);
	}
	printf("\n------------------------------\n");
	printf("최대값:%3d\n", max);
	printf("최소값:%3d\n", min);
	printf("합:%3d, 평균:%.2f\n", sum, avg);

	
	return 0;
}
*/
//배수
/*
#include<stdio.h>
int  main(){
	int  i, k, mok, na;
	int cnt = 0, sum = 0;
	printf("배수를 구할 숫자를 입력하시오\n");
	scanf_s("%d", &k);

	printf("%d의 배수 \n", k);
	for (i = 1; i <= 100; i++){
		na = i % k;
	//	mok = int(i / k);
	//  na = i-mok*k;
	//  na = i-int(i/k)*k;
		if (na == 0) {
			cnt=cnt+1; //++cnt; cnt+=1;
			sum=sum+i;
			printf("i=%3d, cnt=%3d , sum= %3d \n",i, cnt, sum);
		}
	}

	printf("cnt=%3d , sum= %3d \n", cnt, sum);
	
	return 0;
}
*/



// 2차원 배열 성적처리 종합 석차(기본, 고급) 정렬(선택, 버블(sw고급), 삽입) 이분검색 총정리
/*
#include<stdio.h>
int main(void) {
	int i, j, k, rank, temp, sw, flag, input;
	int low = 0, high = 4, mid;
	int a[5][7] = { 0 };
	int key[7] = { 0 };
	// 0열 번호, 1~3열 국어 영어 수학점수, 4열 총점, 5열 평균, 6열 석차

	a[0][1] = 89, a[0][2] = 100, a[0][3] = 79;
	a[1][1] = 46, a[1][2] = 78, a[1][3] = 98;
	a[2][1] = 86, a[2][2] = 79, a[2][3] = 88;
	a[3][1] = 67, a[3][2] = 77, a[3][3] = 88;
	a[4][1] = 78, a[4][2] = 79, a[4][3] = 98;

	for (i = 0; i < 5; i++) {
		a[i][0] = i + 101;
		for (j = 1; j <= 3; j++) {
			a[i][4] += a[i][j];
		}
		a[i][5] = a[i][4] / 3;
		a[i][6] = 1;
	}
//  기본 석차 구하기
//	for (i = 0; i < 5; i++) {
//		for (j = 0; j < 5; j++) {
//			if (a[i][4] < a[j][4]) {
//				a[i][6] += 1;
//			}
//		}
//	}

//  석차 구하기-2_선택정렬 원리 이용
	for (i = 0; i < 4; i++) {
		for (j =i+1; j < 5; j++) {
			if (a[i][4] < a[j][4]) {
				a[i][6] += 1;
			}
			else if (a[i][4] > a[j][4]) {
				a[j][6] += 1;
			}
			else {
				continue;
			}
		}
	}

	printf("---------------입력한 자료 출력---------------\n");
	printf("   번호  국어  영어  수학  총점  평균  석차\n");
	printf("----------------------------------------------\n");
	for (i = 0; i < 5; i++) {
		for (j = 0; j < 7; j++) {
			printf("%6d", a[i][j]);
		}
		printf("\n");
	}
	printf("----------------------------------------------\n");

	while (1) {
		printf("검색석차 입력 : 단_999_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 999)break;
		// 선형 검색(순차 검색)
		flag = 0;
		for (i = 0; i < 5; i++) {
			if (a[i][6] == input) {
				printf("---------------검색한 자료 출력---------------\n");
				printf("   번호  국어  영어  수학  총점  평균  석차\n");
				for (j = 0; j < 7; j++) {
					printf("%6d", a[i][j]);
				}
				printf("\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			printf("해당 자료(석차)가 없습니다. \n");
		}
	}

// 석차기준 선택정렬
//	for (i = 0; i < 4; i++) {
//		for (j = i + 1; j < 5; j++) {
//			if (a[i][6] > a[j][6]) {
//				for (k = 0; k < 7; k++) {
//					temp = a[i][k];
//					a[i][k] = a[j][k];
//					a[j][k] = temp;
//				}
//			}
//		}
//	}

// 석차기준 버블정렬
//	for (i = 0; i < 4; i++) {
//		sw = 0;
//		for (j = 0; j < 5-1-i; j++) {
//			if (a[j][6] > a[j+1][6]) {
//				for (k = 0; k < 7; k++) {
//					temp = a[j][k];
//					a[j][k] = a[j+1][k];
//					a[j+1][k] = temp;
//					sw = 1;
//				}
//			}
//		}
//		if (sw == 0)break;
//	}

	//삽입정렬
	for (i = 1; i <5; i++) {
		for (k = 0; k < 7; k++) { 
			key[k] = a[i][k];
		}
		for (j = i - 1; j >= 0; j--) {
			if (a[j][6] > key[6]) {
				for (k = 0; k < 7; k++) {
					a[j + 1][k] = a[j][k];
				}
			}
			else {  break; 	}
		}
		for (k = 0; k < 7; k++) {
			a[j + 1][k] = key[k];
		}
	}

	printf("---------------정렬후 자료 출력---------------\n");
	printf("   번호  국어  영어  수학  총점  평균  석차\n");
	printf("----------------------------------------------\n");
	for (i = 0; i < 5; i++) {
		for (j = 0; j < 7; j++) {
			printf("%6d", a[i][j]);
		}
		printf("\n");
	}
	printf("----------------------------------------------\n");

	while(1) {
		printf("검색석차 입력 : 단_999_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 999)break;
		// 이분검색
		low = 0, high = 4;
		while (1) {
			if (low > high) {
				printf("해당 자료가 없습니다.");
				break;
			}
			else {
				mid = (low + high) / 2;
				if (a[mid][6] == input) {
					printf("---------------검색한 자료 출력---------------\n");
					printf("   번호  국어  영어  수학  총점  평균  석차\n");
					for (j = 0; j < 7; j++) {
						printf("%6d", a[mid][j]);
					}
					printf("\n");
					break;
				}
				else if (a[mid][6] > input) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
	}
	printf("수고^^ \n");
	return 0;
}

*/


//  석차, 삽입정렬, 선형검색, 이분검색
/*
#include <stdio.h>
#define NUM 10
int main() {
	int i, j,  rank, input, flag, key;
	int low, high, mid;
	int arr1[NUM] = { 30, 60, 50, 70, 40,100, 20, 90,10, 80 };
	printf("----초기자료 출력-------\n");
	for (i = 0; i < NUM; i++) {
		printf("%4d", arr1[i]);
	}
	printf("\n");
	while (1) {
		printf("검색자료 입력 : 단_0_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 0)break;
	// 선형 검색(순차 검색)
		flag = 0;
		for (i = 0; i < NUM; i++) {
			if (arr1[i] == input) {
				printf("--------- 검색 자료 출력----------\n");
				printf("cnt=%3d , arr1[%d]=%4d \n", i + 1, i, arr1[i]);
				printf("--------- ---------------------------\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			printf("해당 자료가 없습니다. \n");
		}
	}
	// 석차 구하기
	for (i = 0; i < NUM; i++) {
		rank = 1;
		for (j = 0; j < NUM; j++) {
			if (arr1[i] < arr1[j]) {
				rank = rank + 1;
			}
		}
		printf("arr1[%d]=%4d, rank=%3d \n", i, arr1[i], rank);
	}
// 삽입 정렬  
	for (i = 1; i < NUM; i++) {  //	for (i = 0; i < NUM - 1; i++) {  // 선택, 버블
		key = arr1[i];
		for (j = i - 1; j >= 0; j--) {
			if (arr1[j] > key) {
				arr1[j + 1] = arr1[j];
			}
			else {
				break;
			}
		}  // j=-1; 탈출
		arr1[j + 1] = key;
	}

	printf("----정렬자료 출력-------\n");
	for (j = 0; j < NUM; j++) {
		printf("%4d", arr1[j]);
	}
	printf("\n");

	while (1) {
		printf("검색자료 입력 : 단_0_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 0)break;
		// 이분검색
		low = 0, high = NUM - 1;
		while (1) {
			if (low > high) {
				printf("해당 자료가 없습니다.");
				break;
			}
			else {
				mid = (low + high) / 2;
				if (arr1[mid] == input) {
					printf("--------- 검색 자료 출력----------\n");
					printf("arr1[%d]=%4d \n", mid, arr1[mid]);
					printf("----------------------------------\n");
					break;
				}
				else if (arr1[mid] > input) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
	}
	printf("수고^^ \n");
	
	return 0;
}
*/

//  석차, 삽입정렬, 선형검색, 이분검색
/*
#include <stdio.h>
#include<stdlib.h>
#include<time.h>
#define NUM 100
int main() {
	int i, j,  rank, input, flag, key, cnt;
	int low, high, mid;
	int arr1[NUM] = { 0 };
//	srand((unsigned int)time(NULL));
	//시간에 따라 seed 값 변경
	for (i = 0; i < NUM; i++) {
		arr1[i] = rand() % 150 + 1;
		if (i > 0) {
			for (j = 0; j < i; j++) {
				if (arr1[i] == arr1[j]) {
		//			printf("번호는 중복 되어서는 안됩니다.\n");
					i--;
					continue;
				}
			}
		}
	}

	printf("----초기자료 출력-------\n");
	for (i = 0; i < NUM; i++) {
		if ((i+1) % 10 == 0) {
			printf("%4d", arr1[i]);
			printf("\n");
		}else {
			printf("%4d", arr1[i]);
		}
	}
	printf("\n");
	while (1) {
		printf("검색자료 입력 : 단_0_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 0)break;
	// 선형 검색(순차 검색)
		flag = 0;
		cnt = 0;
		for (i = 0; i < NUM; i++) {
			cnt = cnt + 1;
			if (arr1[i] == input) {
				printf("--------- 검색 자료 출력----------\n");
				printf("cnt=%3d , arr1[%3d]=%4d \n", i + 1, i, arr1[i]);
				printf("--------- ---------------------------\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			printf("해당 자료가 없습니다. \n");
			printf("cnt=%3d. \n", cnt);
		}

	}
	// 석차 구하기
	for (i = 0; i < NUM; i++) {
		rank = 1;
		for (j = 0; j < NUM; j++) {
			if (arr1[i] < arr1[j]) {
				rank = rank + 1;
			}
		}
		printf("arr1[%3d]=%4d, rank=%3d \n", i, arr1[i], rank);
	}
// 삽입 정렬
	for (i = 1; i < NUM; i++) {  //	for (i = 0; i < NUM - 1; i++) {  // 선택, 버블
		key = arr1[i];
		for (j = i - 1; j >= 0; j--) {
			if (arr1[j] > key) {
				arr1[j + 1] = arr1[j];
			}
			else {
				break;
			}
		}  // j=-1; 탈출
		arr1[j + 1] = key;
	}

	printf("----정렬자료 출력-------\n");
	for (i = 0; i < NUM; i++) {
		if ((i + 1) % 10 == 0) {
			printf("%4d", arr1[i]);
			printf("\n");
		}else {
			printf("%4d", arr1[i]);
		}
	}
	printf("\n");

	while (1) {
		printf("검색자료 입력 : 단_0_입력:종료 : ");
		scanf_s("%d", &input);
		if (input == 0)break;
		// 이분검색
		low = 0, high = NUM - 1;
		cnt = 0;
		while (1) {
			
			if (low > high) {
				printf("해당 자료가 없습니다.");
				printf("cnt=%3d, low=%3d, high=%3d  \n", cnt, low, high);
				break;
			}
			else {
				cnt = cnt + 1;
				mid = (low + high) / 2;
				if (arr1[mid] == input) {
					printf("--------- 검색 자료 출력----------\n");
					printf("cnt=%3d , arr1[%d]=%4d \n",cnt,  mid, arr1[mid]);
					printf("----------------------------------\n");
					break;
				}
				else if (arr1[mid] > input) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
		}
	}
	printf("수고^^ \n");

	return 0;
}
*/



// 로또
/*
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main(void) {
	int num[6];
	int lotto[6];
	int bonus, count, b_count, i, j;
	char ch;
	srand((unsigned int)time(NULL));
	 //시간에 따라 seed 값 변경

	while (1) {
		printf("로또 시작 ? : Y(es), N(o) ");
		scanf_s("%c", ch);
		if (ch == 'N' || ch == 'n')break;

		for (i = 0; i < 6; i++) {
			num[i] = 0;
			lotto[i] = 0;
		}
		bonus = 0;
		count = 0;
		b_count = 0;

		//사용자 입력 번호 저장
		for (i = 0; i < 6; i++) {
			printf("%d 번째 번호를 입력하세요.(_1~45_) : ", i + 1);
			scanf_s("%d", &num[i]);
			if (num[i] < 1 || num[i]>45) {
				printf("번호는 1부터 45까지만 입력해야 합니다.\n");
				i--;
				continue;
			}
			if (i > 0) {
				for (j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						printf("번호는 중복 되어서는 안됩니다.\n");
						i--;
						continue;
					}
				}
			}
		}

		printf("\n");
		printf("-------응모하신 번호--------\n");
		for (i = 0; i < 6; i++) {
			printf("%6d", num[i]);
		}
		printf("\n-----------------------------\n");


		//당첨 번호 저장
		for (i = 0; i < 6; i++) {
			lotto[i] = rand() % 45 + 1;
			if (i > 0) {
				for (j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						printf("번호는 중복 되어서는 안됩니다.\n");
						i--;
						continue;
					}
				}
			}
		}

		// 보너스 번호 만드는 문장
		for (i = 0; i < 1; i++) {
			bonus = rand() % 45 + 1;
			for (j = 0; j < 6; j++) {
				if (lotto[j] == bonus) {
					printf("번호는 중복 되어서는 안됩니다.\n");
					i--;
					continue;
				}
			}
		}

		printf("\n");
		printf("-------당첨번호 출력---------\n");
		for (i = 0; i < 6; i++) {
			printf("%6d", lotto[i]);
		}

		printf("\n-----------------------------\n");
		printf("--보너스 번호-- : %6d", bonus);
		printf("\n-----------------------------\n");

		// 맞춘 개수 검사
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				if (num[i] == lotto[j])
					count++;
			}
		}
		//보너스 번호 검사
		for (i = 0; i < 6; i++) {
			if (num[i] == bonus)
				b_count = 1;
		}

		if (count == 6) {
			printf("1등에 당첨되었습니다\n");
		}
		else if (count == 5 && b_count == 1) {
			printf("2등에 당첨되었습니다\n");
		}
		else if (count == 5) {
			printf("3등에 당첨되었습니다\n");
		}
		else if (count == 4) {
			printf("4등에 당첨되었습니다\n");
		}
		else if (count == 3) {
			printf("5등에 당첨되었습니다\n");
		}
		else {
			printf("꽝 다음 기회에\n");
		}

	}
	printf("안녕^^\n");


	return 0;
}
*/

//버블정렬 응용-3_좌우 교대로_진행
/*
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define NUM 20
int main(void) {
	srand((unsigned int)time(NULL));

	int i, j, temp, cnt=0;
	int left = 0, right = NUM - 1, shift;
	int arr[NUM];
	for (i = 0; i < NUM; i++) {
		printf("%3d", i);
	}
	printf("\n");
	
	for (i = 0; i < NUM; i++) {
		arr[i] = (i + 1) * 4;
	}
	printf("-----------정렬전 자료 출력 ---------\n");
	for (i = 0; i < NUM; i++) {
		printf("%3d", arr[i]);
	}
	printf("\n");
	for (i = 6; i < 15; i++){
		arr[i] = rand() % 30 + 25;
		if (i > 0){
			for (j = 0; j < i; j++){
				if (arr[i] == arr[j])
				{
					i--;
				}
				continue;
			}
		}
	}
	printf("-----------정렬전 자료  재 출력 ---------\n");
	for (i = 0; i < NUM; i++){
		printf("%3d", arr[i]);
	}
	printf("\n");

	while (left < right)	{
		for (i = left; i < right; i++){
			if (arr[i] > arr[i + 1]){
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				shift = i;
			}
		}
		cnt++;
		printf("cnt=%2d회전, left=%2d, right=%2d \n", cnt, left, right);
		for (i = 0; i < NUM; i++) {
			printf("%3d", arr[i]);
		}
		printf("\n");

		right=shift;

		for (i = right; i > left; i--){
			if (arr[i] < arr[i - 1]){
				temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
				shift = i;
			}
		}
		cnt++;
		printf("cnt=%2d회전, left=%2d, right=%2d \n", cnt, left, right);
		for (i = 0; i < NUM; i++) {
			printf("%3d", arr[i]);
		}
		printf("\n");

		left=shift;
	}

	printf("-----------정렬 완료-----------\n");
	printf("cnt=%2d회전, left=%2d, right=%2d \n", cnt, left, right);
	for (i = 0; i < NUM; i++){
		printf("%3d", arr[i]);
	}
	printf("\n");

	return 0;
}
*/


// bubble(버블) 정렬_향상된 정렬 *100
/*
 #include <stdio.h>
#include<stdlib.h>
// #include<time.h>
 #define NUM 20
 int main() {
//	 srand((unsigned int)time(NULL));
	 int  i, j, k, temp, sw;
	 int arr1[NUM] = { 0 };
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", i);
	 }
	 printf("\n");
	 printf("-----------정렬전 자료 입력 ---------\n");
	 for (i = 0; i < NUM; i++) {
		 arr1[i] = rand() % 99 + 1;
		 if (i > 0) {
			 for (j = 0; j < i; j++) {
				 if (arr1[i] == arr1[j])
				 {
					 i--;
				 }
				 continue;
			 }
		 }
	 }

	 printf("----기본 data  출력_정렬 전 자료-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 for (i = 0; i < NUM-1; i++) {
		 sw = 0;
		 for (j = 0; j < NUM-1-i; j++) {
			 if (arr1[j] > arr1[j+1]) {
				 temp = arr1[j];
				 arr1[j] = arr1[j+1];
				 arr1[j+1] = temp;
				 sw = 1;
			 }
		 }

		 printf("i=%2d : , sw=%2d : ", i, sw);
		 for (k = 0; k < NUM; k++) {
			 printf("%3d", arr1[k]);
		 }
		 printf("\n");
		 if (sw == 0)break;
	 }
	 printf("----버블 정렬 완성 된 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");


	 return 0;
 }
 */


// bubble(버블) 정렬_향상된 정렬 *100
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int  i, j, k, temp, sw;
	 int arr1[NUM] = { 30, 10, 40, 20, 50, 99, 70, 90, 88, 80 };
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", i);
	 }
	 printf("\n");
	 printf("----기본 data  출력_정렬 전 자료-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 for (i = 0; i < NUM-1; i++) {
		 sw = 0;
		 for (j = 0; j < NUM-1-i; j++) {
			 if (arr1[j] > arr1[j+1]) {  
				 temp = arr1[j];       
				 arr1[j] = arr1[j+1];   
				 arr1[j+1] = temp; 
				 sw = 1;
			 }                             
		 }

		 printf("i=%2d : , sw=%2d : ", i, sw);
		 for (k = 0; k < NUM; k++) {
			 printf("%3d", arr1[k]);
		 }
		 printf("\n");
		 if (sw == 0)break;
	 }
	 printf("----버블 정렬 완성 된 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");


	 return 0;
 }
 */


// bubble(버블) 정렬
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int  i, j, k, temp;
	 int arr1[NUM] = { 30, 10, 40, 20, 50, 99, 70, 90, 88, 80 };
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", i);
	 }
	 printf("\n");
	 printf("----기본 data  출력_정렬 전 자료-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 for (i = 0; i < NUM-1; i++) {  
		 for (j = 0; j < NUM-1-i; j++) {  
			 if (arr1[j] > arr1[j+1]) {  // arr1[j] 선택   arr1[j+1] 비교대상
				 temp = arr1[j];       //  arr1[0] 선택   arr1[1] 비교대상
				 arr1[j] = arr1[j+1];   //  arr1[1] 선택   arr1[2] 비교대상 
				 arr1[j+1] = temp;    //  arr1[2] 선택   arr1[3] 비교대상
			 }                              //  arr1[3] 선택   arr1[4] 비교대상
		 }
		 printf("i=%2d : ", i);
		 for (k = 0; k < NUM; k++) {
			 printf("%3d", arr1[k]);
		 }
		 printf("\n");
	 }
	 printf("----버블 정렬 완성 된 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");


	 return 0;
 }
 */

/*
//선택정렬 _고급 *100

 #include <stdio.h>
 #define NUM 7
 int main() {
	 int  i, j, k, temp, cnt=0, l, m,  lo;
	 int arr1[2][NUM] = {90, 80, 50,60,70,40,30 };

	 //	"----rank 초기값 1 입력-------");
	 for (i = 0; i < NUM; i++) {
		 arr1[1][i] = 1;
	 }
	 for (j = 0; j < NUM; j++) {
		 printf("%3d", j);
	 }
	 printf("\n");
	 printf("----기본 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 if (arr1[0][i] < arr1[0][j]) {
				 arr1[1][i] = arr1[1][i] + 1;
			 }
		 }
	 }
	 printf("----완성된 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");
	 for (i = 0; i < NUM - 1; i++) {
		 cnt = 0;
		 lo = i;
		 for (j = i + 1; j < NUM; j++) {
			 if (arr1[0][lo] > arr1[0][j]) {
				 lo = j;
			}
		 }
		 for (k = 0; k < 2; k++) {
			 temp = arr1[k][i];
			 arr1[k][i] = arr1[k][lo];
			 arr1[k][lo] = temp;
		 }
		 cnt = cnt + 1;
		 printf("i=%2d, lo=%2d, cnt=%2d: \n", i, lo, cnt);
		 for (l = 0; l < 2; l++) {
			 for (m = 0; m < NUM; m++) {
				 printf("%3d", arr1[l][m]);
			 }
			 printf("\n");
		 }
		 printf("\n");
	 }

	 printf("----정렬 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");
	 return 0;
 }

 */

//기본 순위 석차_ 2차원 배열 이용
/*
 #include <stdio.h>
 #define NUM 7
 int main() {
	 int  i, j, k, temp, cnt=0, l, m;
	 int arr1[2][NUM] = {90, 80, 50,60,70,40,30 };

	 //	"----rank 초기값 1 입력-------");
	 for (i = 0; i < NUM; i++) {
		 arr1[1][i] = 1;
	 }
	 printf("----기본 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 if (arr1[0][i] < arr1[0][j]) {
				 arr1[1][i] = arr1[1][i] + 1;
			 }
		 }
	 }
	 printf("----완성된 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");
	 for (i = 0; i < NUM - 1; i++) {
		 cnt = 0;
		 for (j = i + 1; j < NUM; j++) {
			 if (arr1[0][i] > arr1[0][j]) {
				 for (k = 0; k < 2; k++) {
					 temp = arr1[k][i];
					 arr1[k][i] = arr1[k][j];
					 arr1[k][j] = temp;
				 }
				 cnt = cnt + 1;
			 }
		 }
		 
		 printf("i=%2d, cnt=%2d: \n", i, cnt);
		 for (l = 0; l < 2; l++) {
			 for (m = 0; m < NUM; m++) {
				 printf("%3d", arr1[l][m]);
			 }
			 printf("\n");
		 }
		 printf("\n");
	 }

	 printf("----정렬 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");



	 return 0;
 }
 */

//고급 순위 석차-2 _ 선택정렬 원리 이용_2차원 배열 이용
/*
 #include <stdio.h>
 #define NUM 5
 int main() {
	 int  i, j, k;
	 int arr1[2][NUM] = { 50,60,50,70,30 };
	 
	 //	"----rank 초기값 1 입력-------");
	 for (i = 0; i < NUM; i++) {
		 arr1[1][i] = 1;
	 }
	 printf("----기본 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");
	 for (i = 0; i < NUM-1; i++) {
		 for (j = i+1; j < NUM; j++) {
			 if (arr1[0][i] == arr1[0][j]) {
				 continue;
			 }
			 else if (arr1[0][i] < arr1[0][j]) {
				 arr1[1][i] = arr1[1][i] + 1;
			 }
			 else {          // else if (arr1[0][i] > arr1[0][j]) {
				 arr1[1][j] = arr1[1][j] + 1;
			 }
		 }
	 }
	 printf("----완성된 data  출력-------\n");
	 for (i = 0; i < 2; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 printf("\n");


	 return 0;
 }
 */




// 마방진 도형-1
//  sheet1  300라인
/*
#include <stdio.h>
#define NUM 5
int main() {
	int r = 0, c = NUM / 2, k;
	int arr1[NUM][NUM] = { 0 };
	for (k = 1; k <= NUM * NUM; k++) {
		arr1[r][c] = k;
		if (k%NUM == 0) {
			r = r + 1;
		}
		else {
			r = r - 1;
			c = c + 1;
			if (r < 0) 	r = NUM - 1;
			if (c > NUM - 1) c = 0;
		}
	}
	printf("--마방진 도형-1  출력--\n");
	for (r = 0; r < NUM ; r++) {
		for (c = 0; c < NUM; c++) {
			printf("%3d", arr1[r][c]);
		}
		printf("\n");
	}
	
	return 0;
}
*/


// 달팽이 도형 채우기-2
/*
#include <stdio.h>
#define NUM 5
int main() {
	int r = 0, c = -1, k = 0, i, j, lo , sw = 1;
	int arr1[NUM ][NUM] = { 0 };
	lo = NUM;
	while (1) {
		for (i = 0; i < lo; i++) {
			c = c + sw;
			k = k + 1;
			arr1[r][c] = k;
		}
		lo = lo - 1;
		if (lo == 0)break;
		for (i = 0; i < lo; i++) {
			r = r + sw;
			k = k + 1;
			arr1[r][c] = k;
		}
		sw = sw * -1;
	}

	printf("--완성된 달팽이 도형 출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	return 0;
}
*/


// 달팽이 도형 채우기-1
/*
#include <stdio.h>
#define NUM 5
int main() {
	int r = 0, c = -1, k = 0, i, j, lo;  //  , sw = 1;
	int arr1[NUM ][NUM] = { 0 };
	lo = NUM;
	while (1) {
		for (i = 0; i < lo; i++) {
			c = c + 1;
			k = k + 1;
			arr1[r][c] = k;
		}
		lo = lo - 1;
		if (lo == 0)break;
		for (i = 0; i < lo; i++) {
			r = r + 1;
			k = k + 1;
			arr1[r][c] = k;
		}
		
		for (i = 0; i < lo; i++) {
			c = c - 1;
			k = k + 1;
			arr1[r][c] = k;
		}
		lo = lo - 1;
		if (lo == 0)break;
		for (i = 0; i < lo; i++) {
			r = r - 1;
			k = k + 1;
			arr1[r][c] = k;
		}
	}
	
	printf("--완성된 달팽이 도형 출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
*/


//마름모 도형 채우기-2
/*
#include <stdio.h>
#define NUM 7
int main() {
	int  i, j, k=0, s, e, mid;
	int arr1[NUM][NUM] = { 0 };
	mid = NUM / 2;
	s = mid+1;
	e = mid-1;
	for (i = 0; i < NUM; i++) {
		if (i <= mid) {
			s = s - 1;
			e = e + 1;
		}
		else {
			s = s + 1;
			e = e - 1;
		}
		for (j = s; j <= e; j++) {
			k = k + 1;
			arr1[i][j] = k;
		}
		
	}
	printf("--마름모 도형 채우기-1  출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			if (arr1[i][j] ==0) {
				printf("   ");
			}
			else
				printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/


//마름모 도형 채우기-1
/*
#include <stdio.h>
#define NUM 7
int main() {
	int  i, j, k=0, s, e, mid;
	int arr1[NUM][NUM] = { 0 };
	mid = NUM / 2;  
	s = mid;
	e = mid;
	for (i = 0; i < NUM; i++) {
		for (j = s; j <= e; j++) {
			k = k + 1;
			arr1[i][j] = k;
		}
		if (i < mid) {
			s = s - 1;
			e = e + 1;
		}
		else {
			s = s + 1;
			e = e - 1;
		}
	}
	printf("--마름모 도형 채우기-1  출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/

//모래시계 도형 채우기-4_*100
/*
#include <stdio.h>
#define NUM 7
int main() {
	int  i, j, k=0, s, e, mid;
	int arr1[NUM][NUM] = { 0 };
	mid = NUM / 2;  
	
	for (i = 0; i < NUM; i++) {
		if (i < mid) {
			s = i;
			e = NUM - 1 - i;
		}
		else {
			s = NUM - 1 - i;
			e = i;
		}
		for (j = s; j <= e; j++) {
			k = k + 1;
			arr1[i][j] = k;
		}
	}
	printf("--모래시계 도형 채우기-1  출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	return 0;
}
*/


//모래시계 도형 채우기-3
/*
#include <stdio.h>
#define NUM 9
int main() {
	int  i, j, k=0, s, e, mid;
	int arr1[NUM][NUM] = { 0 };
	mid = NUM / 2;  // mid = (1+NUM) / 2; // mid = NUM / 2 +1;
	s = -1;
	e = NUM;
	for (i = 0; i < NUM; i++) {
		if (i <= mid) {
			s = s + 1;
			e = e - 1;
		}
		else {
			s = s - 1;
			e = e + 1;
		}
		for (j = s; j <= e; j++) {
			k = k + 1;
			arr1[j][i] = k;
		}

	}
	printf("--모래시계 도형 채우기-1  출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/



//모래시계 도형 채우기-2
/*
#include <stdio.h>
#define NUM 7
int main() {
	int  i, j, k=0, s, e, mid;
	int arr1[NUM][NUM] = { 0 };
	mid = NUM / 2;  // mid = (1+NUM) / 2; // mid = NUM / 2 +1;
	s = -1;
	e = NUM;
	for (i = 0; i < NUM; i++) {
		if (i <= mid) {
			s = s + 1;
			e = e - 1;
		}
		else {
			s = s - 1;
			e = e + 1;
		}
		for (j = s; j <= e; j++) {
			k = k + 1;
			arr1[i][j] = k;
		}
	
	}
	printf("--모래시계 도형 채우기-1  출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/



//모래시계 도형 채우기-1
/*
#include <stdio.h>
#define NUM 5
int main() {
	int  i, j, k=0, s, e, mid;
	int arr1[NUM][NUM] = { 0 };
	mid = NUM / 2;  // mid = (1+NUM) / 2; // mid = NUM / 2 +1;
	s = 0;
	e = NUM-1;
	for (i = 0; i < NUM; i++) {
		for (j = s; j <= e; j++) {
			k = k + 1;
			arr1[i][j] = k;
		}
		if (i < mid) {
			s = s + 1;
			e = e - 1;
		}
		else {
			s = s - 1;
			e = e + 1;
		}
	}
	printf("--모래시계 도형 채우기-1  출력--\n");
	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/


//ㄹ사각형 도형 채우기-2_수정*100
/*
#include <stdio.h>
#define R 5
#define C 6
int main() {
	int  i, j, k=0, sw=1, st=0, end=C-1, temp;
	int arr1[R][C] = { 0 };
	for (i = 0; i < R; i++) {
		for (j = st; j != end+sw; j += sw) {
			k = k + 1;
			arr1[i][j] = k;
		}
		printf("변수 교환 전 : i=%2d,  st=%2d, end=%2d, sw=%2d \n", i, st, end, sw);
		temp = st;
		st = end;
		end = temp;
		
		sw = sw * (-1);  // sw=-sw
		printf("변수 교환 후 : i=%2d,  st=%2d, end=%2d, sw=%2d \n", i, st, end, sw);
	}

	printf("---- data  출력-------\n");
	for (i = 0; i < R; i++) {
		for (j = 0; j < C; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/


//ㄹ사각형 도형 채우기-2
/*
#include <stdio.h>
#define R 5
#define C 6
int main() {
	int  i, j, k=0, sw=1, st=0, end=5, temp;
	int arr1[5][6] = { 0 };
	for (i = 0; i < 5; i++) {
		//	for (j = 0; j < 6; j++) {
		//	for (j = 0; j != 6; j++) {
		//	for (j = 0; j != 5+1; j=j+1) {
		//	for (j = 0; j != 5+1; j+=1) {
		//	for (j = 0; j != 5+sw; j += sw) {
		//  for (j = 0; j != 5+sw; j += sw) {
        for (j = st; j != end+sw; j += sw) {
			k = k + 1;
			arr1[i][j] = k;
		}
		temp = st;
		st = end;
		end = temp;
		sw = -sw;
	
		//	for (j = 5; j >=0; j--) {
		//	for (j = 5; j > -1; j--) {
		//	for (j = 5; j > 0-1; j=j-1) {
		//	for (j = 5; j > 0-1; j -= 1) {
		//	for (j = 5; j > 0+(-1); j+=(-1) {
		//	for (j = end; j != st + (-sw); j+=(-sw) {
		//		k = k + 1;
		//		arr1[i][j] = k;
	
	}
	printf("---- data  출력-------\n");
	for (i = 0; i < 5; i++) {
		for (j = 0; j < 6; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");

	return 0;
}
*/


//ㄹ사각형 도형 채우기-1
/*
#include <stdio.h>
#define R 5
#define C 6
int main() {
	int  i, j, k=0;
	int arr1[R][C] = { 0 };
	for (i = 0; i < R; i++) {
		if (i % 2 == 0) {
			for (j = 0; j < C; j++) {
				k = k + 1;
				arr1[i][j] = k;
			}
		}
		else {
			for (j = C-1; j >=0; j--) {
				k = k + 1;
				arr1[i][j] = k;
			}
		}
	}
	printf("---- data  출력-------\n");
	for (i = 0; i < R; i++) {
		for (j = 0; j < C; j++) {
			printf("%3d", arr1[i][j]);
		}
		printf("\n");
	}

	printf("\n");
	
	return 0;
}
*/

// 직각삼각형 도형-2 채우기_배열 사용 X
/*
#include <stdio.h>
#define NUM 5
int main() {
	int  i, j, k = 0;

	for (i = 0; i < NUM; i++) {
		for (j = 0; j < NUM; j++) {
			if (j >= NUM - 1 - i) {
				k += 1;
				printf("%3d", k);
			}
			else
				printf("   ");
		}
		printf("\n");
	}
	printf("\n");

	return 0;
}
*/

//정사각형 도형 채우기_응용_수직으로 자료 채우기
/*
 #include <stdio.h>
 #define NUM 6

 int main() {
	 int  i, j,  k=0;
	 int arr1[NUM][NUM] = { 0 };
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 k = k + 1;
	//		 arr1[i][j] = k;
			 arr1[j][i] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }

	 printf("\n");

	 return 0;
 }
*/
//직각삼각형 도형-3 응용채우기
/*
 #include <stdio.h>
 #define NUM 6

 int main() {
	 int  i, j,  k=0;
	 int arr1[NUM][NUM] = { 0 };
	 for (i = NUM - 1; i >= 0; i--) {
		 for (j = i; j <NUM; j++) {
			 k = k + 1;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			  printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }
	 return 0;
 }
*/


//직각삼각형 도형-4 채우기_bubble sort 응용
/*
 #include <stdio.h>
 #define NUM 5

 int main() {
	 int  i, j,  k=0;
	 int arr1[NUM][NUM] = { 0 };
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j <=NUM-1-i; j++) {
			 k = k + 1;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 if (arr1[i][j] == 0) {
				 printf("   ");
			 }
			 else {
				 printf("%3d", arr1[i][j]);
			 }
		 }
		 printf("\n");
	 }
	 return 0;
 }
*/




//직각삼각형 도형-3 채우기_select sort 응용
/*
 #include <stdio.h>
 #define NUM 7

 int main() {
	 int  i, j,  k=0;
	 int arr1[NUM][NUM] = { 0 };
	 for (i = 0; i < NUM; i++) {
		 for (j = i; j <NUM; j++) {
			 k = k + 1;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 if (arr1[i][j] == 0) {
				 printf("   ");
			 }
			 else {
				 printf("%3d", arr1[i][j]);
			 }
		 }
		 printf("\n");
	 }
	 return 0;
 }
 */




//직각삼각형 도형-2 채우기
/*
 #include <stdio.h>
 #define NUM 5

 int main() {
	 int  i, j,  k=0;
	 int arr1[NUM][NUM] = { 0 };
	 for (i = 0; i < NUM; i++) {
		 for (j = NUM-1-i; j <NUM; j++) {
			 k = k + 1;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 if (arr1[i][j] == 0) {
				 printf("   ");
			 }
			 else {
				 printf("%3d", arr1[i][j]);
			 }
		 }
		 printf("\n");
	 }

	 printf("\n");

	 return 0;
 }
 */




//직각삼각형 도형-1 채우기
/*
 #include <stdio.h>
 #define NUM 6
 int main() {
	 int  i, j,  k=0;
	 int arr1[NUM][NUM] = { 0 };
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j <= i; j++) {
			 k = k + 1;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력 ----\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 if (arr1[i][j] == 0) {
				 printf("   ");
			 }
			 else {
				 printf("%3d", arr1[i][j]);
			 }
		 }
		 printf("\n");
	 }

	 printf("\n");

	 return 0;
 }
*/




//정사각형 도형 채우기
/*
 #include <stdio.h>
 #define NUM 5
 
 int main() {
	 int  i, j, n=0, k=0;
	 int arr1[NUM][NUM] = { 0 };
	 
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 n = n + 1;
			 k = k + n;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 for (j = 0; j < NUM; j++) {
			 printf("%5d", arr1[i][j]);
		 }
		 printf("\n");
	 }

	 printf("\n");

	 return 0;
 }
 */


//사각형 도형 채우기
/*
 #include <stdio.h>
 #define R 5
 #define C 6
 int main() {
	 int  i, j, k=0;
	 int arr1[R][C] = { 0 };
	 for (i = 0; i < R; i++) {
		 for (j = 0; j < C; j++) {
			 k = k + 1;
			 arr1[i][j] = k;
		 }
	 }
	 printf("---- data  출력-------\n");
	 for (i = 0; i < R; i++) {
		 for (j = 0; j < C; j++) {
			 printf("%3d", arr1[i][j]);
		 }
		 printf("\n");
	 }

	 printf("\n");
	 
	 return 0;
 }
*/

//선택정렬 *100
/*
 #include <stdio.h>
 #define NUM 5
 int main() {
	 int  i, j, k, temp;
	 int arr1[NUM] = { 50,60,40,70,30 };
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", i);
	 }
	 printf("\n");
	 printf("----기본 data  출력_정렬 전 자료-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 for (i = 0; i < NUM-1; i++) {  // 선택
		 for (j = i+1; j < NUM; j++) {  // 비교대상
			 if (arr1[i] > arr1[j]) {
			//	 temp = arr1[i];
			//	 arr1[i] = arr1[j];
			//	 arr1[j] = temp;
				 arr1[i] = arr1[i] + arr1[j];
				 arr1[j] = arr1[i] - arr1[j];
				 arr1[i] = arr1[i] - arr1[j];
			 }
		 }
		 printf("i=%2d : ", i);
		 for (k = 0; k < NUM; k++) {
			 printf("%3d", arr1[k]);
		 }
		 printf("\n");
	 }
	 printf("----정렬 완성 된 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 

	 return 0;
 }
 */

//고급 순위 석차-2 _ 선택정렬 원리 이용
/*
 #include <stdio.h>
 #define NUM 5
 int main() {
	 int  i, j, k;
	 int arr1[NUM] = { 50,60,50,70,30 };
	 int rank[NUM];
	 //	"----rank 초기값 1 입력-------");
	 for (i = 0; i < NUM; i++) {
		 rank[i] = 1;
	 }
	 for (i = 0; i < NUM-1; i++) {
		 for (j = i+1; j < NUM; j++) {
			 if (arr1[i] == arr1[j]) {
				 continue;
			 }
			 else if (arr1[i] < arr1[j]) {
				 rank[i] = rank[i] + 1;
			 }
			 else {
				 rank[j] = rank[j] + 1;
			 }
		 }
	 }
	 printf("----기본 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 printf("----rank 출력-----\n");
	 for (j = 0; j < NUM; j++) {
		 printf("%3d", rank[j]);
	 }
	 printf("\n");
	 
	 return 0;
 }
*/


//기본순위 석차-1
/*
 #include <stdio.h>
 #define NUM 5
 int main() {
	 int  i, j, k;
	 int arr1[NUM] = { 50,60,40,70,30 };
	 int rank[NUM];

	 //	"----rank 초기값 1 입력-------");
	 for (i = 0; i < NUM; i++) {
		 rank[i] = 1;
	 }
	 printf("----기본 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 printf("----rank 출력-----\n");
	 for (j = 0; j < NUM; j++) {
		 printf("%3d", rank[j]);
	 }
	 printf("\n");

	 for (i = 0; i < NUM; i++) {  // 선택
		 for (j = 0; j < NUM; j++) {  // 비교대상
			 if (arr1[i] < arr1[j]) {
				 rank[i] = rank[i] + 1;
			 }
		 }
	 }
	 printf("----기본 data  출력-------\n");
	 for (i = 0; i < NUM; i++) {
		 printf("%3d", arr1[i]);
	 }
	 printf("\n");
	 printf("----rank 출력-----\n");
	 for (j = 0; j < NUM; j++) {
		 printf("%3d", rank[j]);
	 }
	 printf("\n");
	
	 return 0;
 }
*/

// 구구단-6  break, continue문장 이용
/*
 #include <stdio.h>
 int main() {
	 int  i = 2 , j, k;
	 while( i <= 9 ) {
		 j = 1;
		 while( j <= 9 ) {
			 if (j  != 5) {
		//	 if ((i%2==0) && (j %2==1)) {
		//	 if (i % 2 == 0 || j % 2 == 1) {
				 k = i * j;
				 printf("%2d * %2d = %2d \n", i, j, k);
			 }
			 else {
				 break ;
			//	 continue;
			//	 goto AA;

			 }
AA:			 j++;
		 }
		printf("------------------- \n");
		 i++;
	 }
	 printf("------------------- \n");
	 printf("%2d * %2d = %2d \n", i, j, k);

	 return 0;
 }
 */

// 2617 
//사과 500원, 배 400원, 감 300원일때 5000원으로 구입가능한 경우의 수
/*
 #include <stdio.h>
 int main() {
	 int  i, j, k, hap, cnt=0;
	 for (i = 1; i <= 10; i++) {
		 for (j = 1; j <= 13; j++) {
			 for (k = 1; k <= 17; k++) {
				 hap = i * 500 + j * 400 + k * 300;
				 if (hap == 5000) {
					 cnt = cnt + 1;
					 printf("cnt=%2d, 사과=%2d개, 배=%2d개, 감=%2d개 \n", cnt, i, j, k);
				 }
			 }
		 }
	 }
	 printf("-----반복문 종료---- \n");
	 printf("cnt=%2d, 사과=%2d개, 배=%2d개, 감=%2d개 \n", cnt, i, j, k);

	 
	 return 0;
 }
 */

// 구구단-5  while이용_응용
/*
 #include <stdio.h>
 int main() {
	 int  i, j, k;
	 i = 1;
	 while( i < 9 ) {
		 i++;
		 j = 0;
		 while ( j < 9 ) {
			 j++;
			 k = i * j;
			 printf("%2d * %2d = %2d \n", i, j, k);
			 
		 }
		 printf("-----%d단 종료---- \n", i);
		 printf("%2d * %2d = %2d \n", i, j, k);
		 printf("--------------------- \n");
		 
	 }
	 printf("---구구단 종료--------- \n");
	 printf("%2d * %2d = %2d \n", i, j, k);

	 return 0;
 }
*/

// 구구단-4  do-while이용_응용
/*
 #include <stdio.h>
 int main() {
	 int  i, j, k;
	 i = 1;
	 do {
		 i++;
		 j = 0;
		 do {
			 j++;
			 k = i * j;
			 printf("%2d * %2d = %2d \n", i, j, k);
			
		 } while (j < 9);
		 printf("-----%d단 종료---- \n", i);
		 printf("%2d * %2d = %2d \n", i, j, k);
		 printf("--------------------- \n");
		 
	 } while (i < 9);
	 printf("---구구단 종료--------- \n");
	 printf("%2d * %2d = %2d \n", i, j, k);

	 return 0;
 }
*/

// 구구단-3  do-while이용
/*
 #include <stdio.h>
 int main() {
	 int  i, j, k;
	 i = 2;
	 do {
		 j = 1;
		 do {
			 k = i * j;
			 printf("%2d * %2d = %2d \n", i, j, k);
			 j++;
		 } while (j <= 9);
		 printf("-----%d단 종료---- \n", i);
		 printf("%2d * %2d = %2d \n", i, j, k);
		 printf("--------------------- \n");
		 i++;
	 } while (i <= 9);
	 printf("---구구단 종료--------- \n");
	 printf("%2d * %2d = %2d \n", i, j, k);

	 return 0;
 }
 */


// 구구단-2  while이용
/*
 #include <stdio.h>
 int main() {
	 int  i, j, k;
	 i = 2;
	 while( i <= 9 ) {
		 j = 1;
		 while ( j <= 9 ) {
			 k = i * j;
			 printf("%2d * %2d = %2d \n", i, j, k);
			 j++;
		 }
		 printf("-----%d단 종료---- \n", i);
		 printf("%2d * %2d = %2d \n", i, j, k);
		 printf("--------------------- \n");
		 i++;
	 }
	 printf("---구구단 종료--------- \n");
	 printf("%2d * %2d = %2d \n", i, j, k);

	 return 0;
 }
*/


// 구구단-1  for 이용
/*
 #include <stdio.h>
 int main() {
	 int  i, j, k;
	 for (i = 2; i <= 9; i++) {
		 for (j = 1; j <= 9; j++) {
			 k = i * j;
			 printf("%2d * %2d = %2d \n", i, j, k);
		 }
		 printf("-----%d단 종료---- \n", i);
//		 printf("%2d * %2d = %2d \n", i, j, k);
	 }
	 printf("---구구단 종료--------- \n");
	 printf("%2d * %2d = %2d \n", i, j, k);
	 
	 return 0;
 }
*/


//
/*
#include <stdio.h>
void bubble_sort(int a[], int count){
	int temp;

	for (int i = 0; i < count-1; i++)	{
		for (int j = 0; j < count - i-1; j++){
			if (a[j] > a[j + 1]){
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}

	for (int i = 0; i < count-1; i++)	{
		for (int j = i+1; j < count; j++)	{
			if (a[i] > a[j]){
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
}
int main(){
	int numA[10] = { 10,9,8,7,6,5,4,3,2,1 };
	bubble_sort(numA, sizeof(numA) / sizeof(int));

	for (int i= 0; i < 10; i++)	{
		printf("%d ", numA[i]);
	}
	printf("\n");

	return 0;
}
*/

//


/*
#include <stdio.h>
void swapnumber(int *first, int *second){
	int temp;

	temp = *first;
	*first = *second;
	*second = temp;
}
int main(){
	int num1 = 10;
	int num2 = 20;
	swapnumber(&num1, &num2);

	printf("%d %d\n", num1, num2);
	return 0;
}
*/

// 1차원 배열의 주소와 값의 참조 
/*
#include<stdio.h>
int main(void){
	int array[3] = { 10,20,30 };

	printf("array+0=%#X, array+1=%#X, array+2=%#X \n", array+0, array+1, array+2);
	printf("*(array + 0)=%d, *(array + 1)=%d, *(array + 2)=%d \n", *(array + 0), *(array + 1), *(array + 2));
	printf("array[0]=%d, array[1]=%d, array[2]=%d \n", array[0], array[1], array[2]);
	printf("*array + 0=%d, *array + 1=%d, *array + 2=%d \n", *array + 0, *array + 1, *array + 2);
	printf("%d %d \n", *(array + 0), *array);

	return 0;
}
*/


//
/*
#include<stdio.h>
int main(void){
	int array[] = { 1,2,3 };

	printf("%x %x %x \n", &array[0], &array[1], &array[2]);
	printf("%d %d %d \n", *&array[0], *&array[1], *&array[2]);
	printf("%d %d %d \n", array[0], array[1], array[2]);
	printf("sizeof(array)=%d , sizeof(int)=%d  \n", sizeof(array), sizeof(int));
	printf("sizeof(float)=%d , sizeof(double)=%d  \n", sizeof(float), sizeof(double));
	return 0;
}
*/

//
/*
#include<stdio.h>
int main(void){
	int array[3] = { 1,2,3 };
	printf("array    =%#x, array+1=%#x, array+2=%#x \n", array, array+1, array+2);
	printf("array+0=%#x , array+1=%#x, array+2=%#x \n", array+0, array+1, array+2);
	printf("%#x %#x %#x \n", &array[0], &array[1], &array[2]);

	return 0;
}
*/

// 배열 정의-5
/*
#include<stdio.h>
int main(){
	int   array1[3] = { 1,2,3 };
	char array2[3] = { 'A','B','C' };
	int cnt;
	printf("&array1[0]=%#X  \n", &array1[0]);
	printf("&array1[1]=%#X  \n", &array1[1]);
	printf("array1=%#X  \n", array1);
	printf("\n---------------------------------------\n");
	printf("&array2[0]=%#X  \n", &array2[0]);
	printf("&array2[1]=%#X  \n", &array2[1]);
	printf("array2=%#X  \n", array2);
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < 3; cnt++) {
		printf("%#X  ", &array1[cnt]);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < 3; cnt++) {
		printf("%3d ", array1[cnt]);
	}
	printf("\n---------------------------------------\n");
//	printf("%x %x %x \n", &array2[0], &array2[1], &array2[2]);
	for (cnt = 0; cnt < 3; cnt++) {
		printf("%#X  ", &array2[cnt]);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < 3; cnt++) {
		printf("%c  ", array2[cnt]);
	}
	printf("\n---------------------------------------\n");

	for (cnt = 0; cnt < 3; cnt++) {
		printf("%2d  ", array2[cnt]);
	}
	printf("\n---------------------------------------\n");
	return 0;
}
*/

// 배열 정의-4
/*
#include<stdio.h>
int main(){
	int array[3] = { 87,99,80 };
	int total = 0, i;
	double avg;
//	printf("배열의 요소 array[3]의 값: %d \n", array[3]);
	for (i = 0; i < 3; i++) {
		total = total + array[i];
		printf("배열의 요소 array[%d]의 값: %d \n", i, array[i]);
	}
	avg = (double)total / 3;
	printf("총점은 %d 이고 ", total);
	printf("평균은 %.2f 입니다\n", avg);

	return 0;
}
*/

// 배열 정의-3
/*
#include <stdio.h>
#define NUM 5
int main(){
	int cnt;
	int array1[NUM] = { 90,80,70,60,50 };   // 배열 선언 과 동시에 저장(초기화) 
	int array2[] = { 90,80,70,60,50 };
	int array3[NUM] = { 90,80,70 };
	for (cnt = 0; cnt < NUM; cnt++) {
		printf("%3d", cnt);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < NUM; cnt++) {
		printf("%3d", array1[cnt]);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < NUM; cnt++) {
		printf("%#X  ", &array1[cnt]);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < NUM; cnt++) {
		printf("*&array1[%2d]=%3d  ",cnt,  *&array1[cnt]);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < NUM; cnt++) {
		printf("%3d", array2[cnt]);
	}
	printf("\n---------------------------------------\n");
	for (cnt = 0; cnt < NUM; cnt++) {
		printf("%3d", array3[cnt]);
	}
	printf("\n---------------------------------------\n");

	return 0;
}
*/


// 배열 정의-2
/*
#include <stdio.h>
int main(void){
	int student[30] = { 90,80,70 };
//  int student[30] = { 0 };

//	student[0] = 90;
//	student[1] = 80;
//	student[2] = 70;

	printf("첫 번째 학생의 점수_student[0] : %d \n", student[0]);
	printf("두 번째 학생의 점수 : %d \n", student[1]);
	printf("세 번째 학생의 점수 : %d \n", student[2]);
	printf("네 번째 학생의 점수 : %d \n", student[3]);
	printf("마지막 student[29] 점수 : %d \n", student[29]);

	return 0;
}
*/


// 배열 정의
/*
#include <stdio.h>
int main(void){
	int student[30];
	printf("첫 번째 학생의 점수_student[0] : %d \n", student[0]);

	student[0] = 90;
	student[1] = 80;
	student[2] = 70;

	printf("첫 번째 학생의 점수_student[0] : %d \n", student[0]);
	printf("두 번째 학생의 점수 : %d \n", student[1]);
	printf("세 번째 학생의 점수 : %d \n", student[2]);
	printf("네 번째 학생의 점수 : %d \n", student[3]);
	printf("다섯 번째 학생의 점수 : %d \n", student[4]);

	return 0;
}
*/

// 피보나치 수열의 합(재귀함수)_2
// 2946 
// Sum=1+1+2+3+5+8+?...+NUM 항까지의 합
/*
 #include <stdio.h>
 int fib(int n);
 int main() {
	 int sum, input, cnt;
	 while (1) {
		 sum = 0;
		 printf("input을 입력하세요= ?  (단 0:종료) : ");
		 scanf_s("%d", &input);
		 if (input == 0)break;
		 for (cnt = 1; cnt <= input; cnt++) {
			 sum = sum + fib(cnt);
			 printf("cnt=%2d, fib(%2d)=%3d, sum=%4d \n", cnt, cnt, fib(cnt), sum);
		 }
		 printf("-------반복문 종료------\n");
		 printf("cnt=%2d, fib(%2d)=%3d, sum=%4d \n", cnt, cnt, fib(cnt), sum);
	 }
	 return 0;
 }

 int fib(int n) {
	 int result;
	 if (n <= 2) {
		 result = 1;
	 }
	 else {
		 result = fib(n - 1) + fib(n - 2);
	 }
	 return result;
 }
*/



// 피보나치 수열의 합(재귀함수)
// Sum=1+1+2+3+5+8+?...+NUM 항까지의 합
/*
 #include <stdio.h>
 int fib(int n);
 int main() {
	 int sum = 0, input, cnt;
	 printf("input을 입력하세요= ? ");
	 scanf_s("%d", &input);
	 for (cnt = 1; cnt <= input; cnt++) {
		 sum = sum + fib(cnt);
		 printf("cnt=%2d, fib(%2d)=%3d, sum=%4d \n", cnt, cnt, fib(cnt), sum);
	 }
	 printf("-------반복문 종료------\n");
	 printf("cnt=%2d, fib(%2d)=%3d, sum=%4d \n", cnt, cnt, fib(cnt), sum);
	 
	 return 0;
 }

 int fib(int n) {
	 int result;
	 if (n <= 2) {
		 result = 1;
	 }
	 else {
		 result = fib(n - 1) + fib(n - 2);
	 }
	 return result;
 }
*/

// 피보나치(재귀함수)
/*
 #include <stdio.h>
 int fib(int n);
 int main() {
	 int  input, answer;
	 while (1) {
		 printf("input을 입력하세요= ? 단 0:종료  = ");
		 scanf_s("%d", &input);
		 if (input == 0)break;
		 answer = fib(input);
		 printf("fib(%2d)=%3d\n", input, answer);
	 }

	return 0;
 }

 int fib(int n) {
	 int result;
	 if (n <= 2) {
		 result = 1;
	 }
	 else {
		 result = fib(n - 1) + fib(n - 2);
	 }
	 return result;
 }
*/





// 함수-2 fact 수열의 합  // recursive(재귀적) // 5!=5*(5-1)!
// Sum=  1!  +   2!    +      3!       +...+NUM! 항까지의 합
/*
 #include<stdio.h>
 double fact(int x);
 int main() {
	 int num, cnt;
	 double  sum=0;
	 printf("num를 입력하세요= ");
	 scanf_s("%d", &num);
	 for (cnt = 1; cnt <= num; cnt++) {
		 sum = sum + fact(cnt);
		 printf("cnt =%2d, fact(%2d) =%13.0f, sum =%13.0f \n", cnt, cnt, fact(cnt), sum);
	 }
	 printf("----반복문 종료------ \n");
	 printf("cnt =%2d, fact(%2d) =%13.0f, sum =%13.0f \n", cnt, cnt, fact(cnt), sum);
	 
	 return 0;
 }

 double fact(int x) {
	 double result;
	 if (x == 1) {
		 result = 1;
	 }
	 else {
		 result = x * fact(x - 1);
		 // result = 5 * 4 * 3 * 2 * fact(1);
	 }
	 return  result;
 }
*/


// 함수: fact  // recursive(재귀적) // 5!=5*(5-1)!
// 1!=1 정의
/*
 #include<stdio.h>
 int fact(int x);
 int main() {
	 int answer, num;
	 while (1) {
		 printf("num를 입력하세요=  단 0:종료 : ");
		 scanf_s("%d", &num);
		 if (num == 0)break;
		 answer = fact(num);
		 printf("fact(%2d)=%5d \n", num, answer);
	 }
	 return 0;
 }

 int fact(int x) {
	 int result;
	 if (x == 1) {
		 result = 1;
	 }
	 else {
		 result = x * fact(x - 1);
		 // result = 5 * 4 * 3 * 2 * fact(1);
	 }
	 return  result;
 }
*/


// 함수정의_3
/*
#include <stdio.h>
void mul(int x, int y);
void div(int x, int y);
 int main(){
	 int a=13, b=3;
	 mul(a, b);

	 return 0;
 }

 void mul(int x, int y) {
	 int result1 = 0;
	 double result2 = 0;
	 result1 = x * y;
	 printf("result1= x * y=%d \n", result1);
	 div(result1,2);
	 return;
 }
 void div(int x, int y) {
	 double result = 0;
	 result = (double)x / y;
	 printf("result= x / y=%.2f \n", result);
	 return;
 }
 */


// 함수정의_2
/*
 #include <stdio.h>
int sum(int x, int y);
int sub(int x, int y);
int mul(int x, int y);
double div(int x, int y);
 int main(){
	 int answer1 = 0;
	 int answer2 = 0;
	 int answer3 = 0;
	 double answer4 = 0;
	 answer1 = sum(13, 3);
	 printf("answer1=%d \n", answer1);
	 answer2 = sub(13, 3);
	 printf("answer2=%d \n", answer2);
	 answer3 = mul(13, 3);
	 printf("answer3=%d \n", answer3);
	 answer4 = div(13, 3);
	 printf("answer3=%.2f \n", answer4);

	 return 0;
 }

 int sum(int x, int y) {
	 int result = 0;
	 result = x + y;
	 return result;
 }
 int sub(int x, int y) {
	 int result = 0;
	 result = x - y;
	 return result;
 }
 int mul(int x, int y) {
	 int result = 0;
	 result = x * y;
	 return result;
 }
 double div(int x, int y) {
	 double result = 0;
	 result = (double)x / y;
	 return result;
 }
 */

// 함수정의
/*
#include <stdio.h>
int sum(int x, int y){
	int result = 0;
	result = x + y;
	return result;
}

int main(){
	int answer = 0;
	answer = sum(3, 4);
	printf("answer=%d \n", answer);

	return 0;
}
*/


//       Sum=2 + 3 +  5 + 8 + 12 + ? +...+NUM(10) 항까지의 합
//         i     2    3     5     8   12
//         j        1    2     3     4     5
/*
#include <stdio.h>
#define NUM 10
int main() {
	int  cnt = 1 , sum =2, i =2 , j =0;
	while( cnt < NUM) {
		j = j + 1;
		i = i + j;
		sum = sum + i;
		printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
		
		cnt++;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);


	return 0;
}
*/



// Sum=2 + 3 +  5 + 8 + 12 + ? +...+NUM(10) 항까지의 합
//   i     2    3     5     8   12
//   j        1    2     3     4     5
/*
#include <stdio.h>
#define NUM 10
int main() {
	int  cnt = 1 , sum =0, i =2 , j =0;
	while( cnt <= NUM) {
		sum = sum + i;
		printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
		j = j + 1;
		i = i + j;
		cnt++;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);

	
	return 0;
}
*/


// 3124
 // Sum=1 + 1 +  2  +  3 + 5+8+13+21+?...+NUM(10항) 항까지의 합;
 //         i     j     fi=i+j
 //               i     j       fi
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int  cnt = 3 ,  i = 1, j = 1, fi, sum = 2 ; 
	 while( cnt <= NUM ) {
		 fi = i + j;
		 sum = sum + fi;
		 printf("cnt=%2d, i=%2d, j=%2d, fi=%3d, sum=%4d\n", cnt, i, j, fi, sum);
		 i = j;
		 j = fi;
		 cnt++;
	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, j=%2d, fi=%3d, sum=%4d\n", cnt, i, j, fi, sum);

	 return 0;
 }
*/



// 3124
 // Sum=1 + 1 +  2  +  3 + 5+8+13+21+?...+NUM(10항) 항까지의 합;
 //         i     j     fi=i+j
 //               i     j       fi
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int  cnt=3 ,  i = 1, j = 1, fi, sum = i+j ;  // sum=2;
 //	for (cnt = 3; cnt <= NUM; cnt++) {
	 while( cnt <= NUM ) {
		 fi = i + j;
		 sum = sum + fi;
		 printf("cnt=%2d, i=%2d, j=%2d, fi=%3d, sum=%4d\n", cnt, i, j, fi, sum);
		 i = j;
		 j = fi;
		 cnt++;
	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, j=%2d, fi=%3d, sum=%4d\n", cnt, i, j, fi, sum);
	 
	 return 0;
 }
 */

// 3103 
// Sum=  1!  +   2!    +      3!       +...+NUM! 항까지의 합
 // Sum = (1) + (1 * 2) + (1 * 2 * 3) + ... + (1 * 2 * 3 * 4 * ...*NUM)
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int i = 0, fact = 1, cnt, sum = 0;
	 for (cnt = 1; cnt <= NUM; cnt++) {
		 i = i + 1;
		 fact = fact * i;
		 sum = sum + fact;
		 printf("cnt=%2d, i=%2d, fact=%7d, sum=%8d\n", cnt, i, fact, sum);
	 }

	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, fact=%3d, sum=%5d\n", cnt, i, fact, sum);

	
	 return 0;
 }
 */

// 2871
// Sum = 1 - 2 + 3 - 4 + ... + NUM(10) 항까지의 합; _3풀이
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int i = 0, cnt, sum = 0,  sw=0; // sw 0 or 1
	 for (cnt = 1; cnt <= NUM; cnt++) {
		 i = i + 1;
		 if (i%2 == 1) {  
			 sum = sum + i;
		 }
		 else {
			 sum = sum - i;
		 }
		 printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i,  sum);

	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, sum=%3d\n", cnt, i, sum);

	 return 0;
 }
*/


// 2871
// Sum = 1 - 2 + 3 - 4 + ... + NUM(10) 항까지의 합;
 // sw 0 or 1_ 신호등
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int i = 0, cnt, sum = 0,  sw=0; // sw 0 or 1
	 for (cnt = 1; cnt <= NUM; cnt++) {
		 i = i + 1;
		 if (sw == 0) {     //if (sw = 0) {   주의
			 sum = sum + i;
			 sw = 1;
		 }
		 else {
			 sum = sum - i;
			 sw = 0;
		 }
		 printf("cnt=%2d, i=%2d, sw=%2d, sum=%3d\n", cnt, i, sw, sum);

	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, sw=%2d, sum=%3d\n", cnt, i, sw, sum);

	 return 0;
 }
 */

// 2924
//  Sum=1-2+3-4+...+NUM(10) 항까지의 합;
 //  Sum=1+(-2)+3+(-4)+...+NUM 항까지의 합;
 // sw 1 or -1  부호
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int i = 0, cnt, sw=1, m, sum = 0;
	 for (cnt = 1; cnt <= NUM; cnt++) {
		 i = i + 1;
		 m = i * sw;
		 sum = sum + m;
		 printf("cnt=%2d, i=%2d, sw=%2d, m=%2d, sum=%3d\n", cnt, i, sw, m, sum);
		 sw = sw * -1; // sw=-sw;
	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, sw=%2d, m=%2d, sum=%3d\n", cnt, i, sw, m, sum);

	
	 return 0;
 }
 */
//제어문 if_4
/*
#include <stdio.h>
int main() {
	int cnt;
		cnt = 0;
AA:	cnt = cnt + 1;  // cnt++;  ++cnt; cnt+=1;
		printf("Hello C world %d번 \n", cnt);

		if (cnt >= 10) {   // if (cnt > 9) {  //  if (cnt == 10) {
			goto BB;
		}
		else {
			goto AA;
		}

BB:		printf("----------반복문 종료-------------\n");
		printf("cnt=%d\n", cnt);

	return 0;
}
*/


//제어문 if_3
/*
#include <stdio.h>
int main() {
	int cnt;
		cnt = 0;
AA:	cnt = cnt + 1;  // cnt++;  ++cnt; cnt+=1;
		printf("Hello C world %d번 \n", cnt);
		
		if (cnt < 10) {   // if (cnt <= 9) {  //  if (cnt != 10) {
			goto AA;
		}

		printf("----------반복문 종료-------------\n");
		printf("cnt=%d\n", cnt);

	return 0;
}
*/


//제어문 if_2
/*
#include <stdio.h>
int main() {
	int cnt;
		cnt = 1;
BB:		printf("Hello C world %d번 \n", cnt);
		cnt++;  // cnt = cnt + 1;  cnt++;  ++cnt; cnt+=1;
		if (cnt > 10) {   // if (cnt >= 11) {   //  if (cnt == 11) {
			goto AA;
		}
		else {
			goto BB;
		}

AA:	printf("----------반복문 종료-------------\n");
		printf("cnt=%d\n", cnt);

	return 0;
}
*/



//제어문 if

// 8) Sum=1+(1+2)+(1+2+3)+(1+2+3+4)+?...+(1+2+3+4+ +NUM) 항까지의 합
// 8) Sum=1+  3+   6+  10 + 15+...+NUM NUM(10)항까지의 합_풀이3
//      i     1    3     6    10     ?
//      j        2     3     4     5
/*
#include <stdio.h>
#define NUM 10
int main() {
	int  cnt , sum =0, i =1, j = 1;
	for (cnt = 1; cnt <= NUM; cnt++) {
		sum = sum + i;
		printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
		j = j + 1;
		i = i + j;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
	return 0;
}
*/


/*
#include <stdio.h>
int main() {
	int cnt;
		cnt = 1;
AA:	printf("Hello C world %d번 \n", cnt);
		cnt++;  // cnt = cnt + 1;  cnt++;  ++cnt; cnt+=1;
		if (cnt <= 10) {   // if (cnt < 11) {  //  if (cnt != 11) {
			goto AA;
		}
		
		printf("----------반복문 종료-------------\n");
		printf("cnt=%d\n", cnt);
	
	return 0;
}
*/
// sw=1;
//  cnt=1;   if (cnt <= 10) {   // if (cnt < 11) {  //  if (cnt != 11) {   증가
//  for (cnt = 1; cnt <= 10; cnt++) {   // cnt는 11일때 탈출  //  cnt는 10 + 1 일때 탈출
//  for (cnt = 1; cnt != 11; cnt++) {   // cnt는 11일때 탈출  //  cnt는 10 + 1 일때 탈출
//  for (cnt = 1; cnt != 10+1; cnt+=1) { 
//  sw = 1;  NUM=10
//  for (cnt = 1; cnt != 10+sw; cnt+=sw) { 
//  for (cnt = 1; cnt != NUM+sw; cnt+=sw) { 
// cnt++;  c; cnt=cnt+1;

// sw=sw*-1;   // sw는 -1

//  cnt=10;  if(cnt >= 1)   {   // if (cnt > 0) {  //   if (cnt != 0) {   감소
//  for (cnt = 10; cnt >= 1; cnt--) {   // cnt는 0일때 탈출  //  cnt는 1 - 1 일때 탈출
// cnt--;  cnt-=1; cnt=cnt-1;
//  for (cnt = NUN; cnt >= 1; cnt--) {
//  for (cnt = NUN; cnt != 0; cnt-=1) {
//  for (cnt = NUN; cnt != 0; cnt+=sw) {
//  for (cnt = NUN; cnt != 1+sw; cnt+=sw) {

// 8) Sum=0 +1+(1+2)+(1+2+3)+(1+2+3+4)+?...+(1+2+3+4+ +NUM) 항까지의 합
// 8) Sum=1+  3+   6+  10 + 15+...+NUM NUM(10)항까지의 합_풀이2
// 8) Sum=0 +1+  3+   6+  10 + 15+...+NUM NUM(10)항까지의 합_풀이2
//      i     0    1    3     6    10     ?
//      j        1    2     3     4     5
/*
#include <stdio.h>
#define NUM 10
int main() {
	int  cnt , sum =0, i =0, j = 0;
	for (cnt = 1; cnt <= NUM; cnt++) {
		j = j + 1;
		i = i + j;
		sum = sum + i;
		printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
	return 0;
}
*/

// 8) Sum=1+(1+2)+(1+2+3)+(1+2+3+4)+?...+(1+2+3+4+ +NUM) 항까지의 합
// 8) Sum=1+  3+   6+  10 + 15+...+NUM NUM(10)항까지의 합_풀이1
//      i     1    3     6    10     ?
//      j        2     3     4     5
/*
#include <stdio.h>
#define NUM 10
int main() {
	int  cnt , sum =1, i =1, j = 1;
	for (cnt = 1; cnt < NUM; cnt++) {
		j = j + 1;
		i = i + j;
		sum = sum + i;
		printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, j=%2d, i=%3d, sum=%5d\n", cnt, j, i, sum);
	return 0;
}
*/
// 2833
// Sum = (1 * 77) + (2 * 76) + (3 * 75) + ... + (77 * 1)
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int  sum = 0, cnt, m, i=0, j= NUM+1;
	 for (cnt = 1; cnt <= NUM; cnt++) {
		 i = i + 1;
		 j = (1+NUM)-i;
		 m = i * j;
		 sum = sum + m;
		 printf("cnt=%2d, i=%2d, j=%2d, m=%4d, sum=%5d\n", cnt, i, j, m, sum);

	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, j=%2d, m=%4d, sum=%5d\n", cnt, i, j, m, sum);

	 return 0;
 }
 */
// 2852
// Sum = (1 * 77) + (2 * 76) + (3 * 75) + ... + (77 * 1)
/*
 #include <stdio.h>
 #define NUM 10
 int main() {
	 int  sum = 0, cnt, m, i=0, j= NUM+1;
	 for (cnt = 1; cnt <= NUM; cnt++) {
		 i = i + 1;
		 j = j - 1;
		 m = i * j;
		 sum = sum + m;
		 printf("cnt=%2d, i=%2d, j=%2d, m=%4d, sum=%5d\n", cnt, i, j, m, sum);
		
	 }
	 printf("----------반복문 종료-------------\n");
	 printf("cnt=%2d, i=%2d, j=%2d, m=%4d, sum=%5d\n", cnt, i, j, m, sum);

	 return 0;
 }
 */
//3_Sum=1 + 3 + 5 + ?...+ NUM   NUM(10)항까지의 합_시험용
//      i    1    3    5
//             2    2    2
/*
#include <stdio.h>
int main() {
	int cnt, i=1, sum=1;
	cnt = 1;
	while(cnt <10 ) {
		i = i + 2;
		sum = sum + i;
		printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
		cnt++;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
	return 0;
}
*/



// 반복문 while 수열의 합-3_변형
//3_Sum=1 + 3 + 5 + ?...+ NUM   NUM(10)항까지의 합
//      i    1    3    5
//             2    2    2
/*
#include <stdio.h>
int main() {
	int cnt, i=1, sum=0;
	cnt = 1;
	while(cnt <= 10 ) {
		sum = sum + i;
		printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
		i = i + 2;
		cnt++;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
	return 0;
}
*/



// 반복문 while 수열의 합-3
//3_Sum=1 + 3 + 5 + ?...+ NUM   NUM(10)항까지의 합
//      i    1    3    5
//             2    2    2
/*
#include <stdio.h>
int main() {
	int cnt, i=-1, sum=0;
	cnt = 1;
	while(cnt <= 10 ) {
		i = i + 2;
		sum = sum + i;
		printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
		
		cnt++;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
	return 0;
}
*/




// 반복문 while
//2_Sum=1+2+3+4+?...+NUM   NUM(10)항까지의 합
//      i    1  2  3  4
//            1  1  1
/*
#include <stdio.h>
int main() {
	int cnt, i=0, sum=0;
	cnt = 0;
	while(cnt < 10 ) {
		cnt++;
		i = i + 1;
		sum = sum + i;
		printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
		
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
	return 0;
}
*/


// 반복문 for
//2_Sum=1+2+3+4+?...+NUM   NUM(10)항까지의 합
//      i    1  2  3  4
//            1  1  1
/*
#include <stdio.h>
int main() {
	int cnt, i=0, sum=0;
	for (cnt = 1; cnt <= 10; cnt++) {
		i = i + 1;
		sum = sum + i;
		printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, i=%2d, sum=%4d\n", cnt, i, sum);
	return 0;
}
*/


// 반복문 while_변형
//1_Sum=7+7+7+...+7  NUM(10항)까지의 합
/*
#include <stdio.h>
int main() {
	int cnt, sum=0;
	cnt = 0;
	while( cnt < 10 ) {
		cnt=cnt+1;
		sum = sum + 7;
		printf("cnt=%2d, sum=%3d\n", cnt, sum);
		
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, sum=%3d\n", cnt, sum);


	return 0;
}
*/

// 반복문 while
//1_Sum=7+7+7+...+7  NUM(10항)까지의 합
/*
#include <stdio.h>
int main() {
	int cnt, sum=0;
	cnt = 1;
	while( cnt <= 10 ) {
		sum = sum + 7;
		printf("cnt=%2d, sum=%3d\n", cnt, sum);
		cnt++;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, sum=%3d\n", cnt, sum);


	return 0;
}
*/

// 반복문 for
//1_Sum=7+7+7+...+7  NUM(10항)까지의 합
/*
#include <stdio.h>
int main() {
	int cnt, sum=0;
	for (cnt = 1; cnt <= 10; cnt++) {
		sum = sum + 7;
		printf("cnt=%2d, sum=%3d\n", cnt, sum);
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%2d, sum=%3d\n", cnt, sum);
	

	return 0;
}
*/


// 반복문 do while
/*
#include <stdio.h>
int main() {
	int cnt;
	cnt = 1;
	do {
		printf("Hello C world %d번 \n", cnt);
		cnt++;  // cnt = cnt + 1;  cnt++;  ++cnt; cnt+=1;
	} while (cnt <= 10);
	printf("----------반복문 종료-------------\n");
	printf("cnt=%d\n", cnt);
	return 0;
}
*/


// 반복문 while_변형
/*
#include <stdio.h>
int main() {
	int cnt;
	cnt = 0;
	while(cnt < 10) {
		cnt++;
		printf("Hello C world %d번 \n", cnt);
		
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%d\n", cnt);


	return 0;
}
*/



// 반복문 while
/*
#include <stdio.h>
int main() {
	int cnt;
	cnt = 1;
	while(cnt <= 10) {
		printf("Hello C world %d번 \n", cnt);
		cnt++;  // cnt = cnt + 1;  cnt++;  ++cnt; cnt+=1;
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%d\n", cnt);


	return 0;
}
*/


// 반복문 for
/*
#include <stdio.h>
int main() { 
	int cnt;
	for (cnt = 1; cnt <= 10; cnt++) {
		printf("Hello C world %d번 \n", cnt);
	}
	printf("----------반복문 종료-------------\n");
	printf("cnt=%d\n", cnt);
	
	
	return 0;
}
*/


// 3393 논리 연산자
/*
 #include<stdio.h>
 int main() {
	 int num1 = 2, num2 = 3, num3 = 5;
	 int result1, result2, result3;

	 result1 = num1 > 0 && num2 < 10;
	 result2 = (num2 <= 2) || (num3 > 5);  // binary(이항, 다항연산자)
	 result3 = !num3; // unary(단항연산자)

	 printf("(num1:2 > 0) && (num2:3 < 10) =%d \n", result1);  // 1(참)
	 printf("(num2:3 <= 2) || (num3:5 > 5) = %d \n", result2);  // 0(거짓)
	 printf("!num3 = %d \n", result3);  // 0(거짓)


	 return 0;
 }
 */

// 3412  관계연산자
/*
 #include<stdio.h>
 int main() {
	 int num1 = 2, num2 = 4;
	 int result1, result2, result3, result4;

	 result1 = (num1 > num2);
	 result2 = (num1 <= num2);
	 result3 = (num1 == num2);
	 result4 = (num1 != num2);

	 printf("num1:2 > num2:4  %d \n", result1);	// 0(거짓)
	 printf("num1:2 <= num2:4   %d \n", result2);	// 1(참)
	 printf("num1:2 == num2:4   %d \n", result3);	// 0(거짓)
	 printf("num1:2 != num2:4   %d \n", result4);	// 1(참)


	 return 0;
 }
*/


// 연산자_ 산술
/*
 #include<stdio.h>
 int main() {
	 int num1, num2, num3, num4;
	 int c, d, e, f;
	 int num5 = 3, num6 = 3, num7 = 3, num8 = 3;
//	 num5 = num6 = num7 =num8 = 3;

	 num5++; // ++num5; num5=num5+1; num5+=1;
	 printf("num5= %d \n", num5);

	 ++num6; // num6++; num6=num6+1; num6+=1;
	 printf("num6= %d \n", num6);

	 num7--; // --num7; num7=num7-1; num7-=1;
	 printf("num7= %d \n", num7);

	 --num8; // num8--; num8=num8-1; num8-=1;
	 printf("num8= %d \n", num8);

	 num1 = num2 = num3 = num4 = 3;
	 c = num1++;  // c=num1; num1=num1+1;
	 printf("c= %d, num1= %d \n", c, num1);
	
	 d = ++num2;  // num2=num2+1; d=num2;
	 printf("d= %d, num2= %d \n", d, num2);

	 e = num3--;  // c=num3; num3=num3-1;
	 printf("e= %d, num3= %d \n", e, num3);

	 f = --num4;  // num4=num4-1; f=num4;
	 printf("f= %d, num4= %d \n", 4, num4);

	 printf("--------------------  \n");
	 num3 = 3;
	 printf("num3=%d, num3주소=%#X \n", num3, &num3);

	 e = ++num3 + ++num3 + ++num3;
	 printf("num3=%d, e=%d  \n", num3, e);

	 printf("num3=%d, num3주소=%#X \n", num3, &num3);
	 printf("--------------------  \n");

	 num4 = 3;
	 f = num4++ + ++num4 + num4++;
	 printf("num4=%d, f=%d  \n", num4, f);
	 	 	 
	 return 0;
 }
 */



/*
#include<stdio.h>
int main() {
	int a = 10, b = 3, c, d, e, f, na;
//	int mok;  
//  float mok1;
	double mok1;
	printf("a + b 덧셈 연산 결과: %3d \n", a + b);
	printf("a - b 뺄셈 연산 결과: %3d \n", a - b);
	printf("a * b 곱셈 연산 결과: %3d \n", a * b);
	printf("a / b 나누기 연산 결과: %3d \n", a / b);
	printf("a %% b 나머지 연산 결과: %3d \n", a % b);
	mok1 = (double)a / b;
//  mok1 = (float)a / b;
	printf("나누기 연산 결과:몫 %.8f \n", mok1);
	na = a - a / b * b;  // a % b
//	printf("나누기 연산자 결과:몫);

	return 0;
}
*/
/*
#include<stdio.h>
int main() {
	int a = 2;
	int b = 5;
	a *= b + 2;
//	a = a * b + 2;  (x)
	a = a * (b + 2);
	printf(" a= %d, b=%d 입니다. \n", a, b);

	return 0;
}
*/

/*
#include<stdio.h>
int main() {
	int a = 250;
	int b = 66;
	int c, e;
	int num3 = 3;
	printf(" a의 값은 %d 입니다. \n", a);
	printf(" b의 값은 %d 입니다. \n", b);
//	printf(" c의 값은 %d 입니다. \n", c);
	
//	a = a + 1;  // a +=1; ++a; a++;
	b = 5;
	a *= b + 2;
	printf(" a= %d, b=%d 입니다. \n", a, b);
	printf("변경된 a의 값은 %d 입니다. \n", a);
	printf("a변수의 번지값은 %#X 입니다. \n", &a);
	printf("변경된 a의 값은 %d 입니다. \n", *&a);
	printf("--------------------- \n");


	c = a + 10;
	printf("변경된 c의 값은 %d 입니다. \n", c);
	printf("c변수의 번지값은 %#X 입니다. \n", &c);
	printf("--------------------- \n");
	b += 10;  // b = b + 10;
	printf("변경된 b의 값은 %d 입니다. \n", b);
	printf("--------------------- \n");
	c = a;
	printf("변경된 c의 값은 %d 입니다. \n", c);
	printf("c변수의 번지값은 %#X 입니다. \n", &c);
	printf("--------------------- \n");
	printf("num3=%d, num3주소=%#X \n", num3, &num3);
	e = ++num3 + ++num3 + ++num3;
	printf(" e=%d  \n",  e);
	printf("num3=%d, num3주소=%#X \n", num3, &num3);

	return 0;
}
*/
/*
#include <stdio.h>
int main() {  
	int a = 65 , b=250, c=97, d=49;
	
	printf("a의 10진수값은 %d 입니다. \n", a);
	printf("a의 16진값은 %x 입니다. \n", a);
	printf("a의 16진값은 %#x 입니다. \n", a);
	printf("a의 16진값은 %#X 입니다. \n", a);
	printf("a의 8진값은 %o 입니다. \n", a);
	printf("a의 8진값은 %#o 입니다. \n", a);
	printf("a의 문자값은 %c 입니다. \n", a);
	printf("--------------------- \n");
	printf("b의 10진수값은 %d 입니다. \n", b);
	printf("b의 16진값은 %x 입니다. \n", b);
	printf("b의 16진값은 %#x 입니다. \n", b);
	printf("b의 16진값은 %#X 입니다. \n", b);
	printf("b의 8진값은 %o 입니다. \n", b);
	printf("b의 8진값은 %#o 입니다. \n", b);
	printf("b의 문자값은 %c 입니다. \n", b);
	printf("--------------------- \n");
	printf("c의 10진수값은 %d 입니다. \n", c);
	printf("c의 16진값은 %#X 입니다. \n", c);
	printf("c의 8진값은 %#o 입니다. \n", c);
	printf("c의 문자값은 %c 입니다. \n", c);
	printf("--------------------- \n");
	printf("d의 10진수값은 %d 입니다. \n", d);
	printf("d의 16진값은 %#X 입니다. \n", d);
	printf("d의 문자값은 %c 입니다. \n", d);

	return 0;
}
*/
/*
#include <stdio.h>
int main() {  // void main(void) {  // int main(void) {
	printf("Hello \"C\" 박성효 \n");
	printf("Hello \'C\' \n");
	printf(" c:\\workEx  \n");
	printf("Hello \t C \n");

    return 0;
}
*/
