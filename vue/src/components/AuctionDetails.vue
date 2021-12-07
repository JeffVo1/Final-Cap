<template>
    
</template>

<script>


export default {
    name:"auction-details" ,
    methods:{
        deleteItem(id) {
            auctionService.delete(id).then(response => {
                 if (response.status == 201) {
                this.getUserItem();
          }
      })
    }
  }
};
  

</script>