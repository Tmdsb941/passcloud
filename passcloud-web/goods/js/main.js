new Vue({
    el:'app',
    data:{
        msg:[],
    },
    mounted: function () {
       this.get();
    },
    methods:{
        getData () {
            var self = this
            $.ajax({
                url: 'http://localhost:8890/product/SearchAll',
                type: 'GET',
                dataType: 'JSONP',
                success: function (res) {
                    self.data = res.data.slice(0, 3)
                    self.opencode = res.data[0].opencode.split(',')
                }
            })
        },
        // get:function () {
        //
        //     this.$http.jsonp("http://localhost:8890/product/SearchAll").then(function (res) {
        //         this.msg=res.body;
        //     },function (reason) {
        //         console.log("请求失败处理");
        //     });
        // }
    },

});