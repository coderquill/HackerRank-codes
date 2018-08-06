/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {
        SinglyLinkedListNode* temp, *p;
        temp = (SinglyLinkedListNode*)malloc(sizeof(SinglyLinkedListNode));
        temp->data=data;
        temp->next=NULL;
        if(head==NULL)
            return temp;
        p=head;
        while(p->next!=NULL)
        {
            p=p->next;
        }
        p->next=temp;
       
        return head;


}